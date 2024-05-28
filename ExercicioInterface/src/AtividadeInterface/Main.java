package AtividadeInterface;

public class Main {
    public static void main(String[] args) {
        LoggerConsole lc = new LoggerConsole();
        LoggerFactory lf = new LoggerFactory();
        LoggerFile lfl = new LoggerFile("log.txt");
        lc.Log(Level.DEBUG, "");
        lf.onConsole();
        lfl.Log(Level.DEBUG,"");



    }
}