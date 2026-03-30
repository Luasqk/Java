package EX01;

public class Main {
    static void main() {
        Disciplina disciplina = new Disciplina("Matemática",270);
        Professor professor = new Professor("Anderson",disciplina);

        professor.exibirDados();
    }
}
