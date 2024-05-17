class BordaRedonda extends Retangulo{
    public BordaRedonda(String texto, int largura, int altura){
        super(texto, largura, altura);
    }

    @Override
    public void desenhar() {
        System.out.println("╭" + "─".repeat(largura - 2) + "╮");
        for (int i = 0; i < altura - 2; i++) {
            if (i == (altura - 2) / 2) {
                System.out.println("│" + texto + " ".repeat(largura - texto.length() - 2) + "│");
            } else {
                System.out.println("│" + " ".repeat(largura - 2) + "│");
            }
        }
        System.out.println("╰" + "─".repeat(largura - 2) + "╯");
    }
}