package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class planificador {

    List<Articulo> articulos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Pedido> pedidos = new ArrayList<>();
    // Obtener envases disponibles

    public List<Envase> obtenerEnvases(int id_Producto) {
        Articulo miArticulo = articulos.stream().filter(unArticulo -> unArticulo.getId() == id_Producto).findAny().orElse(null);
        return miArticulo.getEnvasesDisponibles();
    }

    public void crearPedido(int idCliente, Date fechaUno, int cantidadEntregas, int cadaCuantosDiasSeHaceUnEnvio) {
       Pedido unPedido = new Pedido(idCliente, fechaUno, cantidadEntregas, cadaCuantosDiasSeHaceUnEnvio);
       unPedido.crearEntregas();
       Cliente miCliente = clientes.stream().filter(unCliente -> unCliente.getId() == idCliente).findAny().orElse(null);
       miCliente.agregarPedido(unPedido);

       pedidos.add(unPedido);
    }

    public void agregarArticuloXEntregaAPedido(ArticuloXEntrega unArticuloXEntrega, int[] cantidadesPorFecha , int idPedido){
        Pedido miPedido = buscarPedido(idPedido);
        miPedido.agregarArticuloXEntregaAEntregas(unArticuloXEntrega,cantidadesPorFecha);
    }
    public Pedido buscarPedido(int idPedido){
        return pedidos.stream().filter(unPedido -> unPedido.getIdPedido() == idPedido).findAny().orElse(null);
    }


}
