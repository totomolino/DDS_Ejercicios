package domain.empresa;

public abstract class StrategyEnvio {

    public Envio envio;

    public StrategyEnvio(Envio unEnvio) {
        this.envio = unEnvio;
    }

    public abstract int calcularPrecio();

}

class estrategiaEnvioEstandar extends StrategyEnvio{

    private int tarifaLocal = 2;
    private int tarifaLargaDistancia = 20;

    public estrategiaEnvioEstandar(Envio unEnvio) {
        super(unEnvio);
    }

    @Override
    public int calcularPrecio(){
        if(envio.esLocal()) {
            return envio.paquete.getPeso() * tarifaLocal;
        } else {
            return envio.paquete.getPeso() * tarifaLargaDistancia;
        }
    }
}


class estrategiaEnvioUPS extends StrategyEnvio{


    public estrategiaEnvioUPS(Envio unEnvio) {
        super(unEnvio);
    }

    @Override
    public int calcularPrecio() {
        return envio.paquete.getPeso() + 10;
    }
}


class estrategiaEnvioFEDEX extends StrategyEnvio{


    public estrategiaEnvioFEDEX(Envio unEnvio) {
        super(unEnvio);
    }

    @Override
    public int calcularPrecio() {
        return envio.paquete.getPeso() + 50;
    }
}