public class Estoque {
    String nome;
    int qtdAtual;
    int qtdMinima;

  public Estoque(String n, int atual, int minimo) {
        nome = n;
        qtdAtual = atual;
        qtdMinima = minimo;
    }

    public Estoque() {}

    void mudarNome(String novoNome) {
        nome = novoNome;
    }

    void mudarQtdMinima(int novaQtdMinima) {
        if (novaQtdMinima > 0)
            qtdMinima = novaQtdMinima;
    }

    void repor(int qtd) {
        qtdAtual += qtd; 
    }

    void darBaixa(int qtd) {
        qtdAtual = qtdAtual - qtd; 
    }

    String mostra() {
        return nome + " - Atual: " + qtdAtual + " / Mínima: " + qtdMinima;
    }

    boolean precisaRepor() {
        if (qtdAtual <= qtdMinima) {
            return true;
        } else {
            return false;
        }
    }
}
class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque e1 = new Estoque("Caneta", 10, 5);
        Estoque e2 = new Estoque("Caderno", 3, 2);
        Estoque e3 = new Estoque("Lápis", 7, 4);

        e1.darBaixa(5);
        e2.repor(7);
        e3.darBaixa(4);

        System.out.println(e1.mostra());
        System.out.println(e2.mostra());
        System.out.println(e3.mostra());

        System.out.println("Precisa repor e1? " + e1.precisaRepor());
        System.out.println("Precisa repor e2? " + e2.precisaRepor());
        System.out.println("Precisa repor e3? " + e3.precisaRepor());
    }
}
