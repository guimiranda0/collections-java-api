package set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for(Alunos a: alunosSet){
            if (a.getMatricula() == matricula){
                alunosSet.remove(a);
            }
        }
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new Alunos.ComparetorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {


    }
}
