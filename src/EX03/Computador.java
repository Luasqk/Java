package EX03;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String marca;
    private List<Peca> pecas;

    public Computador(String marca) {
        this.marca = marca;
        this.pecas = new ArrayList<>();
    }

    public void adicionarPeca(String nomePeca) {
        Peca peca = new Peca(nomePeca);
        this.pecas.add(peca);
    }

    public void exibirPecas() {
        System.out.println("Marca: " + marca);
        int i = 1;
        for (Peca j : pecas) {
            System.out.println(" "+i + "-" + j.getNome());
            i++;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }
}