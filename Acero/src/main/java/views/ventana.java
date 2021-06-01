package views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import business.*;

public class ventana {


    public void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo de operacion que desea ejecutar\n" +
            "1- Consultar Envases Disponibles\n" +
            "2- Crear Pedido\n" +
            "3- Salir ");

        int operacion = scanner.nextInt();
        while(operacion != 3) {
            if(operacion == 1) {
                System.out.println("Ingrese codigo de producto");
                int codigoProducto = scanner.nextInt();
                List<Envase> listaEnvases = planificador.obtenerEnvases(codigoProducto);
                for (Envase element: listaEnvases) {
                    element.mostrar();
                }

            } else if (operacion == 2) {

                System.out.println("Ingrese id Cliente");
                int unIdCliente = scanner.nextInt();

                System.out.println("Ingrese la primera fecha (yyyy/mm/dd)");
                int anio = scanner.nextInt();
                int mes  = scanner.nextInt();
                int dia  = scanner.nextInt();
                Date unaFechaUno = new Date(anio,mes,dia);

                System.out.println("Ingrese la cantidad de entregas");
                int unaCantidadEntregas = scanner.nextInt();

                System.out.println("Ingrese cada cuantos dias quiere una entrega");
                int unaPeriodicidad = scanner.nextInt();

                planificador.crearPedido(unIdCliente, unaFechaUno, unaCantidadEntregas, unaPeriodicidad);
                Cliente unCliente = planificador.buscarCliente(unIdCliente);
                Pedido miPedido = unCliente.getPedido();
                //for para leer las cantidades para cada fecha

                //crear articuloXentrega
                int quiereContinuar = 1;
                while (quiereContinuar == 1) {
                    //leer los datos del nuevo producto
                    System.out.println("Ingrese el id del articulo");
                    int unIdArticulo = scanner.nextInt();
                    Articulo unArticulo = planificador.buscarArticulo(unIdArticulo);

                    System.out.println("Ingrese la tolerancia diametro");
                    float unaToleranciaDiametro = scanner.nextFloat();

                    System.out.println("Ingrese la tolerancia largo");
                    float unaToleranciaLargo = scanner.nextFloat();

                    System.out.println("Ingrese la tolerancia ancho");
                    float unaToleranciaAncho = scanner.nextFloat();

                    System.out.println("Ingrese el id del envase");
                    int unIdEnvase = scanner.nextInt();
                    Envase unEnvase = planificador.buscarEnvase(unIdEnvase, unIdArticulo);

                    List<Date> fechasDisponibles = miPedido.getFechasDeEntrega();
                    int cantidadesPorFecha[] = new int[unaCantidadEntregas];

                    for(int i=0; i < unaCantidadEntregas; i++) {
                        Date fechaAConsultar = fechasDisponibles.get(i);
                        System.out.println("Cuantos articulos quiere para el " + fechaAConsultar);
                        int cantArticulos = scanner.nextInt();
                        cantidadesPorFecha[i] = cantArticulos;
                    }
                    ArticuloXEntrega unArticuloXEntrega = planificador.crearArticuloXEntrega(unArticulo, unaToleranciaDiametro, unaToleranciaLargo, unaToleranciaAncho, unEnvase);
                    miPedido.agregarArticuloXEntregaAEntregas(unArticuloXEntrega,cantidadesPorFecha);

                    System.out.println("Si quiere ingresar otro articulo, ingrese 1, sino ingrese cualquier otra cosa que se le ocurra como por ejemplo 98");
                    quiereContinuar = scanner.nextInt();
                }

            } else{
                System.out.println("Codigo de operacion no valido");
            }

        }

        System.out.println("Gracias por utilizar nuestro sistema! Esperamos que le haya servido!");
    }










}
