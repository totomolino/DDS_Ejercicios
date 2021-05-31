package business;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Pedido> pedidosRealizados = new ArrayList<>();
    int id;

    public int getId() {
        return id;
    }

    public void agregarPedido(Pedido unPedido) {
        pedidosRealizados.add(unPedido);
    }
}
