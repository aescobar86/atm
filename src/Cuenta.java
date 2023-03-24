public class Cuenta {
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Su Cuenta tiene un saldo de" + saldo;
    }

    private double saldo = 0.00;

    public void retirar(double montoRetiro) {
        saldo =- montoRetiro;
    }

    public void depositar(double montoRetiro) {
        saldo =+ montoRetiro;
    }
}
