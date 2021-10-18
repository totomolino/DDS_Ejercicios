package Dominio;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pers_id;

   private String pers_nombre;
   private String pers_apellido;
   private String pers_fechaNacimiento;
   private int pers_documento;
   private String pers_telefono;
   private String pers_direccion;
   private String pers_ciudad;
   private String pers_localidad;


    @OneToOne
    @JoinColumn(name = "usu_id")
    private Usuario pers_usuario;

    @OneToOne(mappedBy = "deleg_delegador")
    private Delegacion delegacionADelegar;

    @OneToOne(mappedBy = "deleg_delegado")
    private Delegacion delegacionPropia;

    public void delegar(long idPersona){
        Delegacion.crearDelegacion(EstadoDelegacion.EnEspera, this.pers_id, idPersona);
    }

    public void aceptarDelegacion(){

    }

    public void registrarUsuario(){

    }

    public void actualizarDatos(){
        boolean noSalio = true;
        Scanner sn = new Scanner(System.in);
        Scanner sn2 = new Scanner(System.in);
        while(noSalio)
        System.out.println("1_ Para actualizar fecha de nacimiento");
        System.out.println("2_ Para actualizar la ciudad de residencia");
        System.out.println("3_ Para actualizar la localidad de residencia");
        System.out.println("4_ Para actualizar la foto");
        System.out.println("5_ Para salir");
        System.out.println("Escribe una de las opciones");
        int opcion = sn.nextInt();

    switch(opcion){
        case 1:
            System.out.println("Ingrese la nueva fecha en formato DDMMAA");
            this.setPers_fechaNacimiento(sn2.nextLine());

            break;
        case 2:
            System.out.println("Ingrese la nueva ciudad");
            this.setPers_ciudad(sn2.nextLine());
            break;
        case 3:
            System.out.println("Ingrese la nueva localidad");
            this.setPers_localidad(sn2.nextLine());
            break;
        case 4:
           /* System.out.println("Ingrese la nueva foto");
            foto ..... ;*/
            break;
        case 5:
            noSalio = false;
            break;
    }
    }

    public Long getPers_id() {
        return pers_id;
    }

    public void setPers_id(Long pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_nombre() {
        return pers_nombre;
    }

    public void setPers_nombre(String pers_nombre) {
        this.pers_nombre = pers_nombre;
    }

    public String getPers_apellido() {
        return pers_apellido;
    }

    public void setPers_apellido(String pers_apellido) {
        this.pers_apellido = pers_apellido;
    }

    public String getPers_fechaNacimiento() {
        return pers_fechaNacimiento;
    }

    public void setPers_fechaNacimiento(String pers_fechaNacimiento) {
        this.pers_fechaNacimiento = pers_fechaNacimiento;
    }

    public int getPers_documento() {
        return pers_documento;
    }

    public void setPers_documento(int pers_documento) {
        this.pers_documento = pers_documento;
    }

    public String getPers_telefono() {
        return pers_telefono;
    }

    public void setPers_telefono(String pers_telefono) {
        this.pers_telefono = pers_telefono;
    }

    public String getPers_direccion() {
        return pers_direccion;
    }

    public void setPers_direccion(String pers_direccion) {
        this.pers_direccion = pers_direccion;
    }

    public String getPers_ciudad() {
        return pers_ciudad;
    }

    public void setPers_ciudad(String pers_ciudad) {
        this.pers_ciudad = pers_ciudad;
    }

    public String getPers_localidad() {
        return pers_localidad;
    }

    public void setPers_localidad(String pers_localidad) {
        this.pers_localidad = pers_localidad;
    }

    public Usuario getPers_usuario() {
        return pers_usuario;
    }

    public void setPers_usuario(Usuario pers_usuario) {
        this.pers_usuario = pers_usuario;
    }

    public Delegacion getDelegacionADelegar() {
        return delegacionADelegar;
    }

    public void setDelegacionADelegar(Delegacion delegacionADelegar) {
        this.delegacionADelegar = delegacionADelegar;
    }

    public Delegacion getDelegacionPropia() {
        return delegacionPropia;
    }

    public void setDelegacionPropia(Delegacion delegacionPropia) {
        this.delegacionPropia = delegacionPropia;
    }
}
