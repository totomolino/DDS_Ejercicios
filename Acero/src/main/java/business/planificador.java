package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class planificador {


    private static List<Articulo> articulos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    // Obtener envases disponibles

    public static List<Envase> obtenerEnvases(int id_Producto) {
        Articulo miArticulo = articulos.stream().filter(unArticulo -> unArticulo.getId() == id_Producto).findAny().orElse(null);
        assert miArticulo != null;
        return miArticulo.getEnvasesDisponibles();
    }

    public static void crearPedido(int idCliente, Date fechaUno, int cantidadEntregas, int cadaCuantosDiasSeHaceUnEnvio) {
       Pedido unPedido = new Pedido(idCliente, fechaUno, cantidadEntregas, cadaCuantosDiasSeHaceUnEnvio);
       unPedido.crearEntregas();
       Cliente miCliente = planificador.buscarCliente(idCliente);
        //Cliente miCliente = clientes.stream().filter(unCliente -> unCliente.getId() == idCliente).findAny().orElse(null)
        //assert miCliente != null;
        miCliente.agregarPedido(unPedido);

       pedidos.add(unPedido);
    }

    public static Cliente buscarCliente(int idCliente){
        Cliente miCliente = clientes.stream().filter(unCliente -> unCliente.getId() == idCliente).findAny().orElse(null);
        assert miCliente != null;
        return miCliente;
    }

    public Pedido buscarPedido(int idPedido){
        return pedidos.stream().filter(unPedido -> unPedido.getIdPedido() == idPedido).findAny().orElse(null);
    }

    public static Articulo buscarArticulo(int idArticulo){
        return articulos.stream().filter(unPedido -> unPedido.getId() == idArticulo).findAny().orElse(null);
    }

    public static Envase buscarEnvase(int idEnvase, int idProducto){
        return planificador.obtenerEnvases(idProducto).stream().filter(unEnvase -> unEnvase.getId() == idEnvase).findAny().orElse(null);
    }

    public static ArticuloXEntrega crearArticuloXEntrega(Articulo unArticulo, float unaToleranciaDiametro, float unaToleranciaLargo, float unaToleranciaAncho, Envase unEnvase){
       return new ArticuloXEntrega(unArticulo,unaToleranciaDiametro,unaToleranciaLargo,unaToleranciaAncho,-1, unEnvase);
    }


}
