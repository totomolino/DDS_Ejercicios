package dominio;

public abstract class CuentaFactory {

    TarjetaCredito tarjetaCredito;
    TarjetaDebito tarjetaDebito;
    Regalo regalo;
    Cuenta cuenta;

    public abstract TarjetaCredito crearTarjetaCredito();

    public abstract TarjetaDebito crearTarjetaDebito();

    public abstract Regalo crearRegalo();

    public abstract Cuenta crearCuenta();

}
