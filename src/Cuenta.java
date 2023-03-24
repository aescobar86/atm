public class Cuenta {
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Su Cuenta tiene un saldo de: C$" + saldo;
    }

    private double saldo = 0.00;

    public void retirar(double montoRetiro) {
        if (saldo >= montoRetiro) {
            saldo = saldo - montoRetiro;
        } else {
            System.out.println("Su saldo es insuficiente para realizar el retiro");
            System.out.println();
        }
    }

    public void depositar(double montoRetiro) {
        saldo = saldo + montoRetiro;
    }
}
