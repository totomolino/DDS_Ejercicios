package dominio;

import dominio.joven.jovenCuenta;
import dominio.joven.jovenRegalo;
import dominio.joven.jovenTarjetaDebito;

public class creadorCuentaJoven extends CuentaFactory{
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return null;
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new jovenTarjetaDebito();
    }

    @Override
    public Regalo crearRegalo() {
        return new jovenRegalo();
    }

    @Override
    public Cuenta crearCuenta() {
        return new jovenCuenta();
    }
}
