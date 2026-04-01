package EX07;

public class ContaPoupanca extends Conta{
    private final double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    public double aplicarTaxaJuros(double capital, double taxaJuros,int tempo) {
        return Math.pow(taxaJuros + 1,tempo)*capital;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() + "TaxaJuros: " + getTaxaJuros() + "\n";
    }
}
