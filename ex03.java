public class Aluno {
    String nome;
    int matricula;
    double notaProva1, notaProva2, notaTrabalho;

    public double media() {
        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        return media;
    }

    public double finalNecessario() {
        double m = media();
        if (m >= 6.0) {
            return 0; 
        } else {
            return 10 - (m + 5); 
        }
    }
}
class PrincipalAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Bruna";
        a1.matricula = 123;
        a1.notaProva1 = 5;
        a1.notaProva2 = 4;
        a1.notaTrabalho = 6;

        System.out.println("Média: " + a1.media());
        System.out.println("Precisa tirar no final: " + a1.finalNecessario());
    }
}
