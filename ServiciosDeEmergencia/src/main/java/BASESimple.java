import java.util.ArrayList;
import java.util.List;


class BaseSimple extends Base {

    int numero;
    int tiempo;
    int ambulancias;


    public int cantAmbulancias(){
        return ambulancias;
    }

    @Override
    public int tiempoMedioAsistencia() {
        return tiempo;
    }

    @Override
    public int cuantasBases() {
        return 1;
    }









}
