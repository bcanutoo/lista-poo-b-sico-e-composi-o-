import java.util.ArrayList;

public class Funcionario {
    int id;
    String nome;
    double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    void aplicarBonus(double valor) {
        if (valor >= 0)
            salario += valor;
    }

    void reajustar(double percent) {
        double novo = salario * (1 + percent / 100);
        if (novo >= 0)
            salario = novo;
    }

    public String toString() {
        return id + " - " + nome + " R$" + salario;
    }
}
class PrincipalFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(1, "Luis Mário", 2000));
        lista.add(new Funcionario(2, "Lia", 1500));
        lista.add(new Funcionario(3, "Beatriz", 3000));
        lista.add(new Funcionario(4, "Diego", 2500));
        lista.add(new Funcionario(5, "Sarah", 4000));
        lista.add(new Funcionario(6, "Adriano", 1800));

        lista.get(1).aplicarBonus(300);
        lista.get(2).reajustar(5);

        for (Funcionario f : lista) {
            if (f.id == 3) System.out.println("Encontrado: " + f);
        }
      
        lista.sort((a, b) -> Double.compare(b.salario, a.salario));
        System.out.println("Top 3 salários:");
        for (int i = 0; i < 3; i++) {
            System.out.println(lista.get(i));
        }
    }
}
