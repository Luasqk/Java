package EX14;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;

    //a criacao da classe abstrata Animal evita a duplicacao de codigo por implementar metodos que todas as filhas
    //deverao ter obrigatoriamente

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public abstract void emitirSom();
    //esse metodo foi criado como abstrato para poder servir de molde para as classes filhas
    //sendo assim, por isso ele nao precisa de escopo

    public abstract void mover();
    //abstracao

    public void exibirDados(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
