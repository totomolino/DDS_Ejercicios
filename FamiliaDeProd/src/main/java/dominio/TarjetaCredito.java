package dominio;

public class TarjetaCredito {

    int costo;
    float nomina;
    float pension;

    public TarjetaCredito(int costo, float nomina, float pension) {
        this.costo = costo;
        this.nomina = nomina;
        this.pension = pension;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public float getNomina() {
        return nomina;
    }

    public void setNomina(float nomina) {
        this.nomina = nomina;
    }

    public float getPension() {
        return pension;
    }

    public void setPension(float pension) {
        this.pension = pension;
    }
}
