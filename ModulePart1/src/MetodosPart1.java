import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosPart1 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as 10 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(1d);
        notas.add(2d);
        notas.add(3d);
        notas.add(4d);
        notas.add(5d);
        notas.add(6d);
        notas.add(7d);
        notas.add(8d);
        notas.add(9d);
        notas.add(10d);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d)); // indexOf retorna a posição da nota no vetor

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // posição 4, elemento 8
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 7: ");
        notas.set(notas.indexOf(5d), 7.0); // passamos a posição da nota pelo indexOf e substituimos pela nota 7
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // contains retorna um valor booleano

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        } */

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // indicando a posição na array
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // usando um método do collection para identificar a menor nota
        System.out.println("Exiba a menor nota: " + Collections.max(notas)); // usando um método do collection para identificar a maior nota

        System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator(); // variavel do padrão interator
        Double soma = 0d;
        while (iterator.hasNext()) { // verifica se tem elemento, se tiver retorna true
            Double next = iterator.next(); // adiciona esse elemento dentro dessa variavel
            soma += next; // soma dos elemento
        }

        System.out.println("Soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); // metodo size, é a quantidade de itens dentro do vetor

        System.out.println("Remova a nota 1: ");
        notas.remove(1d); // removendo o elemento 0
        System.out.println(notas);

        System.out.println("Remova a nota na posição 5: ");
        notas.remove(5); // removendo a nota na posição 5
        System.out.println(notas);

        System.out.println("Remova notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear(); // apaga toda o vetor
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // irá retorna true se estiver vázia e false se não

    }
}
