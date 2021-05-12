package domain.empresa;

public abstract class StrategyEnvio {

    public Envio envio;

    public StrategyEnvio(Envio unEnvio) {
        this.envio = unEnvio;
    }

    public abstract int calcularPrecio();

}



