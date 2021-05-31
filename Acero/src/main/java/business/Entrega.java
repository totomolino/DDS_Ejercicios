package business;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entrega {

    Date fechaEntrega;
    List<ArticuloXEntrega> articulosAentregar = new ArrayList<>();

    public Entrega(Date fechaEntrega){
        this.setFechaEntrega(fechaEntrega);
    }

    public Date getFEchaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void agregarArticuloXEntrega(ArticuloXEntrega unArticuloXEntrega){
        articulosAentregar.add(unArticuloXEntrega);
    }

}
