package EX08;

public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Uno","Fiat",1994,8000);
        System.out.println(v);
        v.exibirDetalhes();
        v.calcularIPVA(v.getPreco());

        Carro c = new Carro("Mobi","Fiat",2015,50000,4);
        System.out.println(c);
        c.calcularIPVA(v.getPreco());

        Caminhao ca = new Caminhao("113","Scania",1998,120000,4);
        System.out.println(ca);
        ca.calcularIPVA(v.getPreco());

        Concessionaria cc = new Concessionaria();
        cc.adicionarVeiculo("Uno","Fiat",1994,8000);

        cc.listarVeiculos();
    }
}
