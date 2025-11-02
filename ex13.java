import java.util.ArrayList;

public class Produto {
    String sku;
    String nome;
    double preco;
}
public class ItemPedido {
    Produto produto;
    int qtd;
    double precoUnit;

    double subtotal() {
        return qtd * precoUnit;
    }
}

public class PedidoCompra {
    String fornecedor;
    ArrayList<ItemPedido> itens = new ArrayList<>();
    boolean aprovado = false;

    void adicionar(ItemPedido i) {
        itens.add(i);
    }

    double totalBruto() {
        double t = 0;
        for (ItemPedido i : itens)
            t += i.subtotal();
        return t;
    }
}
