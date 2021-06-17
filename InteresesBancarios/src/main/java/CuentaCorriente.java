public class CuentaCorriente {

    Interes interes;
    double deuda;

    public void calcularInteres(){

        interes.interesUtilizado(this);
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
}
