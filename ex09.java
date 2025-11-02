import java.util.ArrayList;

public class CartaoCredito {
    double limite;
    double fatura;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.fatura = 0;
    }

    void comprar(double valor) {
        if (fatura + valor <= limite)
            fatura += valor;
        else
            System.out.println("Compra negada!");
    }

    void pagar(double valor) {
        if (valor > 0)
            fatura -= valor;
        else
            System.out.println("Valor inválido!");
    }
}
class Cliente {
    String nome;
    CartaoCredito cartao;

    public Cliente(String nome, CartaoCredito cartao) {
        this.nome = nome;
        this.cartao = cartao;
    }
}

class PrincipalCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ana", new CartaoCredito(1000)));
        clientes.add(new Cliente("Bia", new CartaoCredito(800)));
        clientes.add(new Cliente("Cris", new CartaoCredito(500)));
        clientes.add(new Cliente("Davi", new CartaoCredito(1200)));

        clientes.get(0).cartao.comprar(900);
        clientes.get(1).cartao.comprar(900); 
        clientes.get(2).cartao.pagar(200);
        clientes.get(3).cartao.comprar(1000);

        Cliente maior = clientes.get(0);
        for (Cliente c : clientes) {
            if (c.cartao.fatura > maior.cartao.fatura)
                maior = c;
        }
        System.out.println("Maior fatura: " + maior.nome);
    }
}
