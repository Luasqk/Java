package EX01;

public class Disciplina {
    private String nome;
    private double cargaHoraria;

    public Disciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nDisciplina: "+nome+"\nCarga Horária: "+cargaHoraria;
    }
}
