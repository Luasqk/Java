package EX08;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(String modelo, String marca, int ano, double preco){
        Veiculo veiculo = new Veiculo(modelo, marca, ano, preco);
        this.veiculos.add(veiculo);
    }

    public void listarVeiculos(){
        System.out.println("\n====================");
        System.out.println("Lista de veiculos:");
        System.out.println("====================");
        if(veiculos.isEmpty()){
            System.out.println("A lista está vazia");
            return;
        }
        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo);
            System.out.println("====================");
        }
    }
}
