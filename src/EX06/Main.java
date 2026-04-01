package EX06;

public class Main {
    static void main() {
        Forma f = new Forma("Triangulo","verde");
        Circulo c = new Circulo("Circulo", "roxo",2);
        Retangulo r = new Retangulo("Retangulo","azul",5,3);
        Retangulo q = new Retangulo("Quadrado","verde",5);

        System.out.println(f);
        System.out.println(c);
        System.out.println(r);
        System.out.println(q);
    }
}
