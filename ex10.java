import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionar(Aluno a) {
        for (Aluno al : alunos) {
            if (al.matricula == a.matricula) {
                System.out.println("Matrícula já existente!");
                return;
            }
        }
        alunos.add(a);
    }

    void listar() {
        for (Aluno a : alunos)
            System.out.println(a.nome);
    }

    void remover(int matricula) {
        alunos.removeIf(a -> a.matricula == matricula);
    }
}
class PrincipalTurma {
    public static void main(String[] args) {
        Turma t = new Turma();

        t.adicionar(new Aluno());
        t.alunos.get(0).nome = "Bruno";
        t.alunos.get(0).matricula = 10;

        t.adicionar(new Aluno());
        t.alunos.get(1).nome = "Carla";
        t.alunos.get(1).matricula = 11;

        t.remover(10);
        t.listar();
    }
}
