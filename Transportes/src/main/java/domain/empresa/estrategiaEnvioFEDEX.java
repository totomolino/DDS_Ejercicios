package domain.empresa;

class estrategiaEnvioFEDEX extends StrategyEnvio {


    public estrategiaEnvioFEDEX(Envio unEnvio) {
        super(unEnvio);
    }

    @Override
    public int calcularPrecio() {
        return envio.paquete.getPeso() + 50;
    }
}
