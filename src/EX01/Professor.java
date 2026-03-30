package EX01;

public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }
    public void exibirDados(){
        System.out.println("Nome: "+nome+disciplina);
    }
}
