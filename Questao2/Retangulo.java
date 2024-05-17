abstract class Retangulo {
    protected String texto;
    protected int largura;
    protected int altura;

    public Retangulo(String texto, int largura, int altura) {
        this.texto = texto;
        this.largura = largura;
        this.altura = altura;
    }

    // Método abstrato para desenhar o retângulo
    public abstract void desenhar();
}
