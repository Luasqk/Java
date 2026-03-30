package EX02;

public class Funcionario {
    private String nome, cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nCargo: "+cargo+"\n";
    }
}
