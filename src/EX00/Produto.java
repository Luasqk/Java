package EX00;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco <=0 ){
            System.out.println("digite um valor válido.");
        }else
            this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0){
            System.out.println("digite um valor válido.");
        }else
            this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "EX00.Produto: " + getNome() + "\n" + "Preço: " + "R$" + getPreco() + "\n" + "Quantidade: " + quantidade;
    }
}
