package AtividadeInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFactory {
    public void onConsole(){
        // data e hora atual
        LocalDateTime now = LocalDateTime.now();

        // formatar data
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormat = data.format(now);

        // formatar hora
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormat = hora.format(now);

        System.out.printf("[%s]", dataFormat);
        System.out.printf("[%s]", horaFormat);
    }
    public Logger onFile(){
        return null;
    }
}
