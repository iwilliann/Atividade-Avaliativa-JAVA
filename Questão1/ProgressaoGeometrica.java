package Questão1;

class ProgressaoGeometrica extends Progressao {
    private int base;

    public ProgressaoGeometrica(int inicio, int base) {
        super(inicio);
        this.base = base;
    }

    protected void avancar() {
        atual *= base;
    }
}