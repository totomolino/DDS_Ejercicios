package Views;

import Dominio.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Usuario yo;
    Persona miPersona;
    boolean sesionIniciada = false;
    Sistema miSistema = Sistema.getInstancia();
    public void iniciarMenu() {

        Scanner sn = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Registrar usuario");
            System.out.println("2. Ingresar");
            System.out.println("0. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado registrar usuario");
                        System.out.println("Ingrese Usuario");
                        String usuarioProvisorio = str.nextLine();
                        while (miSistema.usuarioNoValido(usuarioProvisorio)) {
                            System.out.println("Nombre de usuario no valido, vuelva a intentarlo");
                            usuarioProvisorio = str.nextLine();
                        }
                        System.out.println("Ingrese Contrasena");
                        String contrasenaProvisoria = str.nextLine();
                        Usuario miUsuario = new Usuario();
                        miUsuario.crearUsuario(usuarioProvisorio, contrasenaProvisoria);
                        miSistema.agregarUsuario(miUsuario);
                        yo = miUsuario;
                        miPersona = new Persona();
                        this.menuIngreso();

                        break;
                    case 2:
                        System.out.println("Has seleccionado Ingresar");
                        while (!sesionIniciada) {
                            System.out.println("Ingrese usuario");
                            usuarioProvisorio = str.nextLine();
                            System.out.println("Ingrese contrasena");
                            contrasenaProvisoria = str.nextLine();
                            if (miSistema.validarIngreso(usuarioProvisorio, contrasenaProvisoria)) {
                               // yo = miSistema.dameUsuario(usuarioProvisorio);
                              //  miPersona= miSistema.damePersona(yo);
                                sesionIniciada=true;
                                this.menuIngreso();
                            }
                        }
                        break;

                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    public void menuIngreso(){
        Sistema miSistema = Sistema.getInstancia();
        Scanner sn = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Actualizar datos");
            System.out.println("2. Generar delegado");
            System.out.println("3. Ver solicitudes");
            //SOLO ADMINS
            System.out.println("4. Listado personas");
            System.out.println("5. Listado delegaciones");
            System.out.println("0. Log out");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Actualizar datos");
                        miPersona.actualizarDatos();
                        break;

                    case 2:
                        System.out.println("Has seleccionado generar delegado");
                        System.out.println("Has seleccionado generar delegado");

                        break;
                    case 3:
                        System.out.println("Has seleccionado autorizaciones");
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}


