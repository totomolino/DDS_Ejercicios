
import views.ventana;
import business.Cliente;
import business.Envase;
import business.Articulo;

import java.util.ArrayList;
import java.util.List;

public class mainDea {

    private static ventana unaVentana = new ventana();
    private static Cliente unCliente = new Cliente(1);
    private static Envase unEnvase = new Envase(1, 1);
    private static List<Envase> listaEnvases = new ArrayList<>();


    

    public static void main(String[] args) {

        listaEnvases.add(unEnvase);
        Articulo unArticulo = new Articulo(1,listaEnvases);
        unaVentana.mostrarMenu();


    }

};
