package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int resultado = 0;
        if(!numeros.isEmpty()){
            for (Integer i : numeros){
                resultado += i;
            }
        }
        return resultado;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer i: numeros){
                if (i > maiorNumero){
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer i: numeros){
                if (i <= menorNumero){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(16);

        somaNumeros.exibirNumeros();

    }
}
