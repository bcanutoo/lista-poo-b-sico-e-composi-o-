import java.util.ArrayList;

public class ItemPedido {
    String descricao;
    int quantidade;
    double precoUnitario;

    double subtotal() {
        return quantidade * precoUnitario;
    }
}

public class Pedido {
    ArrayList<ItemPedido> itens = new ArrayList<>();

    void adicionar(ItemPedido i) {
        itens.add(i);
    }

    double total() {
        double soma = 0;
        for (ItemPedido i : itens)
            soma += i.subtotal();
        return soma;
    }
}
public class PrincipalPedido {
    public static void main(String[] args) {
        Pedido p = new Pedido();

        ItemPedido i1 = new ItemPedido();
        i1.descricao = "Caderno";
        i1.quantidade = 2;
        i1.precoUnitario = 10;

        p.adicionar(i1);
        System.out.println("Total: " + p.total());
    }
}
public class PrincipalPedido {
    public static void main(String[] args) {
        Pedido p = new Pedido();

        ItemPedido i1 = new ItemPedido();
        i1.descricao = "Caderno";
        i1.quantidade = 2;
        i1.precoUnitario = 10;

        p.adicionar(i1);
        System.out.println("Total: " + p.total());
    }
}

