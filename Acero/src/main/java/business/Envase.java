package business;

public class Envase {

    int codEnvase;
    int capacidad;

    public Envase(int codEnvase, int capacidad) {
        this.codEnvase = codEnvase;
        this.capacidad = capacidad;
    }

    public void mostrar(){
        System.out.println("Codigo envase\n" + codEnvase + "Capacidad:\n" + capacidad);
    }

    public int getId() {
        return codEnvase;
    }
}
