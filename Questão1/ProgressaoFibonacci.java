package Questão1;

class ProgressaoFibonacci extends Progressao {
    private int anterior;

    public ProgressaoFibonacci(int primeiro, int segundo) {
        super(primeiro);
        anterior = segundo - primeiro;
    }

    protected void avancar() {
        int temp = atual;
        atual += anterior;
        anterior = temp;
    }
}