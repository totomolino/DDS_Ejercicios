package domain.empresa;

public class estrategiaEnvioUPS extends StrategyEnvio {


    public estrategiaEnvioUPS(Envio unEnvio) {
        super(unEnvio);
    }

    @Override
    public int calcularPrecio() {
        return envio.paquete.getPeso() + 10;
    }
}
