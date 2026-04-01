package EX06;

public class Circulo extends Forma{
    private double raio;
    private final double PI = Math.PI;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }
    public double calcularPerimetro(){
        return PI * raio * 2;
    }
    public double calcularArea(){
        return PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return super.toString() + "Raio: " + getRaio() + "\n";
    }
}
