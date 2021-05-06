package domain.cuentas;

public class Cuenta {

    private int saldo;

    public Cuenta(int unSaldo) {
        this.setSaldo(unSaldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
