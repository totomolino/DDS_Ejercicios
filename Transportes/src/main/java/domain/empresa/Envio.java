package domain.empresa;

public class Envio {

    private String origen;
    private String destino;
    private int estrategiaEnvio;
    public Paquete paquete;

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setEstrategiaEnvio(int estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Envio(String unOrigen, String unDestino, int unaEstrategiaEnvio, Paquete unPaquete) {

        this.setOrigen(unOrigen);
        this.setDestino(unDestino);
        this.setEstrategiaEnvio(unaEstrategiaEnvio);
        this.setPaquete(unPaquete);

    }

    public int calcularPrecio() {

        StrategyEnvio oEstrategia;
        switch(estrategiaEnvio)
            {
                case 1:
                    oEstrategia = new estrategiaEnvioEstandar(this);
                    break;
                case 2:
                    oEstrategia = new estrategiaEnvioUPS(this);
                    break;
                case 3:
                    oEstrategia = new estrategiaEnvioFEDEX(this);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + estrategiaEnvio);
            }

        return oEstrategia.calcularPrecio();
    }

    public boolean esLocal() {

        return origen.equals(destino);

    }
}
