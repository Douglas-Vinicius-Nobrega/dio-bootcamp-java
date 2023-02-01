import java.util.ArrayList;
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

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
