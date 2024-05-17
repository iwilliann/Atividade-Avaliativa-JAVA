package Questão1;

class PA extends Progressao {
    private int i;

    public PA(int inicio, int i) {
        super(inicio);
        this.i = i;
    }

    protected void avancar() {
        atual += i;
    }
}