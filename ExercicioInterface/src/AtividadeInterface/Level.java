package AtividadeInterface;

public enum Level {
    WARNING(0, 255, 0),
    DEBUG(255, 255, 0),
    ERROR(255, 0, 0);
    private int r;
    private int g;
    private int b;

    Level(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
