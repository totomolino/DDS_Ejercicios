package business;

import java.util.List;

public class Articulo {

    int id;
    List<Envase> EnvasesDisponibles;


    public List<Envase> getEnvasesDisponibles() {

        return EnvasesDisponibles;
    }

    public int getId() {
        return id;
    }

    public Articulo(int id, List<Envase> envasesDisponibles) {
        this.id = id;
        EnvasesDisponibles = envasesDisponibles;
    }
}
