import java.util.ArrayList;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    String exibirSaldo() {
        return "Conta: " + numero + " | Saldo: R$" + saldo;
    }
}
class PrincipalConta {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria("001", "Luis Mário", 1000));
        contas.add(new ContaBancaria("002", "Lia", 200));
        contas.add(new ContaBancaria("003", "Beatriz", 500));
        contas.add(new ContaBancaria("004", "Manoel", 0));

        contas.get(0).depositar(500);
        contas.get(1).sacar(300);
        contas.get(2).sacar(100);
        contas.get(3).depositar(-10);
 
        for (ContaBancaria c : contas) {
            if (c.numero.equals("003")) {
                System.out.println("Encontrada: " + c.titular);
            }
        }

        ContaBancaria maior = contas.get(0);
        for (ContaBancaria c : contas) {
            if (c.saldo > maior.saldo) {
                maior = c;
            }
        }
        System.out.println("Maior saldo: " + maior.titular + " - R$" + maior.saldo);
    }
}
