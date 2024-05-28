package AtividadeInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    private String arquivoPath;

    public LoggerFile(String arquivoPath){
        this.arquivoPath = arquivoPath;
    }

    @Override
    public void Log(Level level, String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatData = now.format(format);
        String formatHora = String.format("%s [%s] %s", formatData, level, message);

        try (BufferedWriter esc = new BufferedWriter(new FileWriter(arquivoPath, true))){
            esc.write(formatHora);
            esc.newLine();
        }
        catch (IOException e){
            System.out.println("ERRO -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Logger log = new LoggerFile("log.txt");
    }
}
