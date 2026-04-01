package EX06;

public class Retangulo extends Forma{
    private double altura, largura;

    public Retangulo(String nome, String cor, double altura, double largura) {
        super(nome, cor);
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(String nome, String cor, double lado) {
        this(nome, cor, lado, lado);
    }
    //sobrecarga de construtores

    public double calcularArea(){
        return (altura*largura);
    }
    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return super.toString() + "Altura: " + getAltura() + "\nLargura: " + getLargura() + "\nArea: " +
                String.format("%.2f", calcularArea()) + "\nDiagonal: " + String.format("%.2f", calcularDiagonal()) + "\n";
    }
}
