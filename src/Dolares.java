public class Dolares {
    private int tasaCambio = 36;
    private Cuenta cuenta;

    public Dolares(Cuenta cordoba) {
        this.cuenta = cordoba;
    }

    public double getSaldo() {
        return cuenta.getSaldo() / this.tasaCambio;
    }

    public void depositar(double monto) {
        cuenta.depositar(this.tasaCambio * monto);
    }

    public void retirar(double monto) {
        cuenta.retirar(this.tasaCambio * monto);
    }

    @Override
    public String toString() {
       return "El saldo en dólares es: US$" + this.getSaldo();
    }
}
