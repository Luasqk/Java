package EX08;

public class Carro extends Veiculo {
    private int numeroPortas = 4;

    public Carro(String modelo, String marca, int ano, double preco, int numeroPortas) {
        super(modelo, marca, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public Carro() {}

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void calcularIPVA(double preco){
        double ipva = preco*4/100;
        System.out.println("IPVA: " + ipva);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero Portas: " + getNumeroPortas();
    }
}
