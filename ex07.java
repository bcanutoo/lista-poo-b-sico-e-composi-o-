import java.util.ArrayList;

public class Endereco {
    String cidade;
    String uf;

    public Endereco(String cidade, String uf) {
        if (uf.length() != 2) {
            System.out.println("UF inválida, usando XX");
            this.uf = "XX";
        } else {
            this.uf = uf;
        }
        this.cidade = cidade;
    }
}
class Pessoa {
    String nome;
    String cpf;
    Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco e) {
        if (cpf == "") System.out.println("CPF vazio!");
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = e;
    }
}
class PrincipalPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Bia", "111", new Endereco("Goiânia", "GO")));
        pessoas.add(new Pessoa("Geovana", "222", new Endereco("Anápolis", "GO")));
        pessoas.add(new Pessoa("Albert", "333", new Endereco("Brasília", "DF")));
        pessoas.add(new Pessoa("Vanessa", "444", new Endereco("Anápolis", "GO")));
        pessoas.add(new Pessoa("Alan", "555", new Endereco("Caldas", "MG")));

        for (Pessoa p : pessoas) {
            if (p.endereco.cidade == "Anápolis") { 
                System.out.println(p.nome + " mora em Anápolis");
            }
        }
    }
}
