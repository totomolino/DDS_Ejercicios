package Dominio;

import Respuestas.devolverObjeto;
import Utils.BDUtils;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import spark.Spark;

import java.util.List;

import static spark.route.HttpMethod.get;

public class Sistema {

    List<Persona>personasExist;
    List<Usuario>usuarios;
    private static Sistema instancia = null;

    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }

    public static void definePaths() {
        Spark.get("/delegaciones", Sistema::buscarLasQueDelegaronEnMi);
    }

    private static String buscarLasQueDelegaronEnMi(Request request, Response response) {
        String id = request.queryParams("id");

        List<Delegacion> miLista = BDUtils.buscarLasQueDelegaronEnMi(id);

        response.type("application/json");

        response.status(200);
        return new devolverObjeto(miLista, ("Toma las delegaciones de" + id)).transformar();
    }

    public void autorizarPersona(Persona p1, Persona p2){

    }

    public void revocarAutorizacion(Persona p1, Persona p2){

    }

    public void reportePersonas(){

    }

    public void reporteDelegaciones(){

    }


    public boolean usuarioNoValido(String usuarioProvisorio) {
        // TODO UN SELECT QUEEEEEE SE FIJE SI YA EXISTE EL NOMBRE DE USUARIO EN LA BD
        return true;
    }

    public void agregarUsuario(Usuario miUsuario) {
        // TODO AGREGAR EL USUARIO A LA BD
    }

    public boolean validarIngreso(String usuarioProvisorio, String contrasenaProvisoria) {
        // TODO VALIDAR QUE EL USUARIO Y LA CONTRA ESTEN BIEN
        return true;
    }
    /*
    public Usuario dameUsuario(String usuarioProvisorio) {
        // TODO BUSCAR AL USUARIO EN LA BD Y DEVOLVERLO

    }

    public Persona damePersona(Usuario yo) {
        // TODO DEVOLVER LA PERSONA ASOCIADA AL USUARIO
    }*/
}
