package business;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticuloXEntrega {
    Articulo articulo;
    float toleranciaDiam;
    float toleranciaLarg;
    float toleranciaAnch;
    int cantidad;
    Envase envase;

    public ArticuloXEntrega(Articulo articulo, float toleranciaDiam, float toleranciaLarg, float toleranciaAnch, int cantidad, Envase envase) {
        this.articulo = articulo;
        this.toleranciaDiam = toleranciaDiam;
        this.toleranciaLarg = toleranciaLarg;
        this.toleranciaAnch = toleranciaAnch;
        this.cantidad = cantidad;
        this.envase = envase;
    }

    public ArticuloXEntrega dameUnClon() {
        ArticuloXEntrega clon = new ArticuloXEntrega(articulo ,toleranciaDiam ,toleranciaLarg ,toleranciaAnch , -1 , envase);
        return clon;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
