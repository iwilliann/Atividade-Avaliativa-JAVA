package Questão1;

public class POO {
    public static void main(String[] args) {
        System.out.println("Progressão Aritmética - ");
        PA a = new PA(4, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(a.proximo());
        }

        System.out.println("\nProgressão Geométrica:");
        ProgressaoGeometrica g = new ProgressaoGeometrica(2, 3);
        for (int i = 0; i < 5; i++) {
            System.out.println(g.proximo());
        }

        System.out.println("\nProgressão Fibonacci:");
        ProgressaoFibonacci f = new ProgressaoFibonacci(0, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(f.proximo());
        }
    }
}