package business;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;


public class Pedido {

    int idCliente;
    Date fechaUno;
    Date ultimaFecha;
    int cantEntregas;
    int periocidad;
    int idPedido;
    List <Date> fechasDeEntrega = new ArrayList<>();
    List<Entrega> entregas = new ArrayList<>();


    public Pedido(int unIdCliente, Date fechaUno, int cantidadEntregas, int cadaCuantosDiasSeHaceUnEnvio) {
        this.setIdCliente(unIdCliente);
        this.setFechauno(fechaUno);
        this.setCantEntregas(cantidadEntregas);
        this.setPeriocidad(cadaCuantosDiasSeHaceUnEnvio);
    }

    public void crearFechasDeEntrega() {
        ultimaFecha = fechaUno;
        for(int i=1; i <= cantEntregas; i++) {
            fechasDeEntrega.add(ultimaFecha);
            ultimaFecha = new Date(ultimaFecha.getTime() + (1000 * 60 * 60 * 24 * periocidad));
        }
    }

    public void agregarArticuloXEntregaAEntregas(ArticuloXEntrega unArticuloXEntrega, int[] cantidadesPorFecha){
        for(int i=0; i <= cantEntregas; i++) {
            int unaCantidad = cantidadesPorFecha[i];
            ArticuloXEntrega aXeAuxiliar = unArticuloXEntrega.dameUnClon();
            aXeAuxiliar.setCantidad(unaCantidad);
            entregas.get(i).agregarArticuloXEntrega(aXeAuxiliar);
        }
    }

    public void crearEntregas(){

        for(int i = 0 ; i < cantEntregas; i++){
            Entrega unaEntrega = new Entrega(fechasDeEntrega.get(i));
            entregas.add(unaEntrega);
        }
    }



    Date today = new Date();

    public int  getIdCliente() {
        return idCliente;
    }

    public Date getFechauno() {
        return fechaUno;
    }

    public int getCantEntregas() {
        return cantEntregas;
    }

    public int getPeriocidad() {
        return periocidad;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechauno(Date fechauno) {
        this.fechaUno = fechauno;
    }

    public void setCantEntregas(int cantEntregas) {
        this.cantEntregas = cantEntregas;
    }

    public void setPeriocidad(int periocidad) {
        this.periocidad = periocidad;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}



