package map.Pesquisa;

public class Produtos {


    private String nome;
    private int quantidade;
    private double preço;

    public Produtos(String nome, int quantidade, double preço) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preço = preço;
    }


    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preço=" + preço +
                '}';
    }
}
