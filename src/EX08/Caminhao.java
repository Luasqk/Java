package EX08;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, String marca, int ano, double preco, double capacidadeCarga) {
        super(modelo, marca, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao() {}

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void calcularIPVA(double preco){
        double ipva = preco*2/100 ;
        System.out.println("IPVA: " + ipva);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidade: " + getCapacidadeCarga();
    }
}
