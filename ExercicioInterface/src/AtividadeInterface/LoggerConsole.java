package AtividadeInterface;

public class LoggerConsole implements Logger {
    @Override
    public void Log(Level level, String message) {
        // mostrar na tela qual level é escolhido
        switch (level){
            case WARNING:
                System.out.print(ConsoleColors.GREEN + "[WARNING] ESSA É UMA MENSAGEM DE AVISO! ");
                break;
            case DEBUG:
                System.out.print(ConsoleColors.YELLOW + "[DEBUG] ESSA É UMA MENSAGEM DE DEPURAÇÃO! ");
                break;
            case ERROR:
                System.out.print(ConsoleColors.RED + "[ERROR] ESSA É UMA MENSAGEM DE ERRO! ");
                break;
        }
        System.out.println(message);
    }
}
