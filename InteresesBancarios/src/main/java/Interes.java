public class Interes {

    double interesCC = 0.99;
    double interesCA = 0.99;
    double interesTC = 1.05;


    public void interesUtilizado(CuentaCorriente unaCC) {
        double deuda = unaCC.getDeuda();
        deuda = deuda * interesCC;
        unaCC.setDeuda(deuda);
    }
    public void interesUtilizado(CajaDeAhorro unaCA) {
        double deuda = unaCA.getDeuda();
        deuda = deuda * interesCA;
        unaCA.setDeuda(deuda);
    }
    public void interesUtilizado(TarjetaDeCredito unaTC) {
        double deuda = unaTC.getDeuda();
        deuda = deuda * interesTC;
        unaTC.setDeuda(deuda);
    }




}
