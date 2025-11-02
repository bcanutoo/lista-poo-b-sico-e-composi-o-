import java.time.LocalDateTime;
import java.util.ArrayList;

public class ConsultaMedica {
    String paciente;
    LocalDateTime dataHora;
    String especialidade;

    public ConsultaMedica(String paciente, LocalDateTime dataHora, String esp) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.especialidade = esp;
    }
}
public class Clinica {
    ArrayList<ConsultaMedica> consultas = new ArrayList<>();

    void agendar(ConsultaMedica c) {
        consultas.add(c);
    }

    void listar() {
        for (ConsultaMedica c : consultas)
            System.out.println(c.paciente + " - " + c.especialidade);
    }
}

public class PrincipalClinica {
    public static void main(String[] args) {
        Clinica clin = new Clinica();

        clin.agendar(new ConsultaMedica("Pedro", LocalDateTime.now().plusDays(1), "Dermatologista"));
        clin.agendar(new ConsultaMedica("Luisa", LocalDateTime.now().plusDays(1), "Cardiologista"));
        clin.listar();
    }
}
