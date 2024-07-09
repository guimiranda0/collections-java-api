package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produtos> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!produtosMap.isEmpty()){
            for(Produtos p: produtosMap.values()){
                valorTotal += p.getPreço()*p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produtos obterProdutoMaisCaro(){
       Produtos produtoMaisCaro = null;
       double menorPreco = Double.MIN_VALUE;
       if(!produtosMap.isEmpty()){
           for(Produtos p: produtosMap.values()){
               if(p.getPreço() > menorPreco){
                   produtoMaisCaro = p;
               }
           }
       }
       return produtoMaisCaro;
    }

    public static void main(String[] args) {

    }
}
