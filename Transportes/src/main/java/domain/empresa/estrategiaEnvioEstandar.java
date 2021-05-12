package domain.empresa;

public class estrategiaEnvioEstandar extends StrategyEnvio{

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


