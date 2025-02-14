package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {

    private String nome;
    private long matricula;
    private double media;

    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(nome, alunos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    static class ComparetorPorNota implements Comparator<Alunos>{


        @Override
        public int compare(Alunos a1, Alunos a2) {
            return Double.compare(a1.getMedia(), a2.getMedia());
        }
    }

}
