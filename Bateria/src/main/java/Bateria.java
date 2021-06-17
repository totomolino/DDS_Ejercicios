import java.util.ArrayList;
import java.util.List;

public class Bateria {

    boolean conectado;
    boolean cargando;

    int carga;//en porcentaje
    int tiempo;//minutos restantes estimados


    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
    }

    public void setCarga(int carga) {
        this.carga = carga;

        if(carga == 50){//Ejemplo de apliaccion del observer

            this.notifica();

        }

    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    List<Observador> observadores = new ArrayList<>();

    public void notifica(){

        observadores.forEach(unObserver -> unObserver.updateCarga());
        observadores.forEach(unObserver -> unObserver.updateTiempo());


    }






}
