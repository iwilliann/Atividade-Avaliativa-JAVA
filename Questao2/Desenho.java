public class Desenho {
    public static void main(String[] args) {
        // Testando Retângulo com bordas arredondadas
        Retangulo bordaRedonda = new BordaRedonda(" ", 20, 5);
        System.out.println("Retângulo com bordas arredondadas:");
        bordaRedonda.desenhar();

        // Testando Retângulo com linhas duplas
        Retangulo LinhaDupla = new LinhasDuplas(" ", 20, 5);
        System.out.println("Retângulo com linhas duplas:");
        LinhaDupla.desenhar();

        // Testando Retângulo com arte ASCII
        Retangulo ASCII = new ASCII(" ", 20, 5);
        System.out.println("Retângulo com arte ASCII:");
        ASCII.desenhar();


        // Testando Retângulo colorido
        String ANSI_BLUE = "\u001B[34m";
        Retangulo Colorido = new Colorido(" ", 20, 5, ANSI_BLUE);
        System.out.println("Retângulo colorido:");
        Colorido.desenhar();
    }
}