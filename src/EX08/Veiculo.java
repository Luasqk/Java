package EX08;

public class Veiculo {
    private String modelo, marca;
    private int ano;
    private double preco;

    public Veiculo(){}

    public Veiculo(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano >= 1885) {
            this.ano = ano;
        }
        else System.out.println("Insira uma data válida");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        }
        else System.out.println("Insira um valor válido");
    }

    public void calcularIPVA(double preco){
        double ipva = preco*1/100;
        System.out.println("IPVA: " + ipva);
    }

    public void exibirDetalhes(){
        System.out.println("Modelo :" + getModelo() + "\nMarca:" + getMarca() + "\nAno:" + getAno()  +
                "\nPreco:" + getPreco());
    }

    @Override
    public String toString() {
        return "\nModelo:" + getModelo() + "\nMarca:" + getMarca() + "\nAno:" + getAno()  +
                "\nPreco:" + getPreco();
    }
}
