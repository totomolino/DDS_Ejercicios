package dominio;

import dominio.oro.OroCuenta;
import dominio.oro.OroRegalo;
import dominio.oro.OroTarjetaCredito;
import dominio.oro.OroTarjetaDebito;

public class creadorCuentaOro extends CuentaFactory {


    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new OroTarjetaCredito();
    }

    @Override
    public TarjetaDebito crearTarjetaDebito() {
        return new OroTarjetaDebito();
    }

    @Override
    public Regalo crearRegalo() {
        return new OroRegalo();
    }

    @Override
    public Cuenta crearCuenta() {
        return new OroCuenta();
    }
}
