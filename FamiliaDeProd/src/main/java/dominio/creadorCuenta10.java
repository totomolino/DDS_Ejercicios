package dominio;

import dominio.diez.diezCuenta;
import dominio.diez.diezRegalo;
import dominio.diez.diezTarjetaCredito;
import dominio.diez.diezTarjetaDebito;

public class creadorCuenta10 extends CuentaFactory{
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new diezTarjetaCredito();
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new diezTarjetaDebito();
    }

    @Override
    public Regalo crearRegalo() {
        return new diezRegalo();
    }

    @Override
    public Cuenta crearCuenta() {
        return new diezCuenta();
    }
}
