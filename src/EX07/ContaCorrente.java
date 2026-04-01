package EX07;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(saldo + limite >= valor ){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Limite: " + getLimite() + "\n";
    }
}
