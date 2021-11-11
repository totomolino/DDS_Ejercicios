package dominio;

import dominio.estandar.estandarCuenta;
import dominio.estandar.estandarTarjetaDebito;

public class creadorCuentaEstandar extends CuentaFactory{
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return null;
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new estandarTarjetaDebito();
    }

    @Override
    public Regalo crearRegalo() {
        return null;
    }

    @Override
    public Cuenta crearCuenta() {
        return new estandarCuenta();
    }
}
