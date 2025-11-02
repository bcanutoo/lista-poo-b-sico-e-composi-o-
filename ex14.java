import java.util.ArrayList;

public class Professor {
    int id;
    String nome;
}
public class Aula {
    String tema;
    int duracaoMin;

    public Aula(String tema, int duracao) {
        this.tema = tema;
        this.duracaoMin = duracao;
    }
}

public class Modulo {
    String titulo;
    ArrayList<Aula> aulas = new ArrayList<>();
}

public class Curso {
    String nome;
    Professor professor;
    ArrayList<Modulo> modulos = new ArrayList<>();

    void adicionarModulo(Modulo m) {
        modulos.add(m);
    }
}
