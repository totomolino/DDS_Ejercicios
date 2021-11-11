package dominio;

public class Cuenta {

    float interes;
    float descubierto;

    public Cuenta(float interes, float descubierto) {
        this.interes = interes;
        this.descubierto = descubierto;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(float descubierto) {
        this.descubierto = descubierto;
    }
}
