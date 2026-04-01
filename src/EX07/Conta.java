package EX07;

public class Conta {
    private String  titular;
    protected double  saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }else  {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void depositar(int valor, String descricao) {
        this.saldo += valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + getTitular() + "\nSaldo: " + getSaldo() + "\n";
    }
}
