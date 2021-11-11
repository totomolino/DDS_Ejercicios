package dominio;

public class Regalo {

    TipoRegalo tipoRegalo;

    public Regalo(TipoRegalo tipoRegalo) {
        this.tipoRegalo = tipoRegalo;
    }

    public TipoRegalo getTipoRegalo() {
        return tipoRegalo;
    }

    public void setTipoRegalo(TipoRegalo tipoRegalo) {
        this.tipoRegalo = tipoRegalo;
    }
}
