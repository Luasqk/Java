package EX06;

public class Forma {
    private String nome;
    protected String cor;

    public Forma(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCor: " + getCor() + "\n";
    }
}
