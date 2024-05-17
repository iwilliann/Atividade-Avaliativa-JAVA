package Questão1;

class Progressao {
    protected int atual;

    public Progressao(int inicio) {
        atual = inicio;
    }

    protected void avancar() {
        atual += 1;
    }

    public int proximo() {
        avancar();
        return atual;
    }

    public void resetar() {
        atual = 0;
    }
}