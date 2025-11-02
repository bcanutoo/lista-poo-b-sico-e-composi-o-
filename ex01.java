public class Funcionario {
    String nome; 
    public double calculaSalario(double vendaBruta) {
        double salario = 0;
        if (vendaBruta > 8000) {
            salario = 382.33 + (8.675 / 100 * vendaBruta);
        } else {
            salario = 177.12 + (3.87 / 100 * vendaBruta);
        }
        return salario;
    }
}
class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Carlos";
        double salarioFinal = f.calculaSalario(8500);

        System.out.println("Funcionário: " + f.nome);
        System.out.println("Salário calculado: R$" + salarioFinal);
    }
}
