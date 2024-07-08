package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<Palavra> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        for(Palavra p: palavrasUnicasSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                palavrasUnicasSet.remove(p);
            }
        }
    }

    public void verificarPalavra(String palavra){
        String presente = " não está presente";
        for(Palavra p: palavrasUnicasSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                presente = " está presente!";
            }
        }
        System.out.println(palavra + presente);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {


    }
}
