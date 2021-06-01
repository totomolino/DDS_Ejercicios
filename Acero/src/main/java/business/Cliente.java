package business;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    Pedido pedido;
    int id;

    public int getId() {

        return id;
    }

    public void agregarPedido(Pedido unPedido) {
        pedido = unPedido;
    }

    public Pedido getPedido(){
        return pedido;
    }
}
