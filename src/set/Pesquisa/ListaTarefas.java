package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(descricao);
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (t.isConcluido()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (!t.isConcluido()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {

    }
}
