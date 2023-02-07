/*
Dadas as seguinter informações sobre meus gatos, crie uma lista e ordene
esta lista exibindo
(nome - idade - cor)

Gato 1 = nome: Jon, Idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdencaoList {
    public static void main(String[] args) {
        List<Gato> meusGasto = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGasto);

        System.out.println("--\tOrdem de aleatória\t---");
        Collections.shuffle(meusGasto); // bagunçar meu vetor
        System.out.println(meusGasto);

        System.out.println("--\tOrdem natural (nome)\t---");
        Collections.sort(meusGasto); // collection tem um método de organização, que precisa do comparator
        System.out.println(meusGasto);


        System.out.println("--\tOrdem de idade\t---");
        // Collections.sort(meusGasto, new ComparatorIdade());
        meusGasto.sort(new ComparatorIdade());
        System.out.println(meusGasto);


        System.out.println("--\tOrdem de cor\t---");
        meusGasto.sort(new ComparatorCor());
        System.out.println(meusGasto);

        System.out.println("--\tOrdem de Nome/Cor/Idade\t---");
        meusGasto.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGasto);


    }
}

class Gato implements Comparable<Gato> { // implemento uma interface
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) { // interface compareTo
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements  Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
