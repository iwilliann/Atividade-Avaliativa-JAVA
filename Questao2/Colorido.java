class Colorido extends Retangulo {
    private String cor;

    public Colorido(String texto, int largura, int altura, String cor) {
        super(texto, largura, altura);
        this.cor = cor;
    }

    @Override
    public void desenhar() {
        String ANSI_RESET = "\u001B[0m";
        System.out.println(cor + "+" + "-".repeat(largura - 2) + "+" + ANSI_RESET);
        for (int i = 0; i < altura - 2; i++) {
            if (i == (altura - 2) / 2) {
                System.out.println(cor + "|" + texto + " ".repeat(largura - texto.length() - 2) + "|" + ANSI_RESET);
            } else {
                System.out.println(cor + "|" + " ".repeat(largura - 2) + "|" + ANSI_RESET);
            }
        }
        System.out.println(cor + "+" + "-".repeat(largura - 2) + "+" + ANSI_RESET);
    }
}