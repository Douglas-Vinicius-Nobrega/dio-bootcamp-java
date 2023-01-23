import java.util.Random;

/*
 Faça um programa que leia 20 números e o armaze-os em um vetor.
 Ao final mostra os números e seus sucessores
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios");
        for (int numeros : numerosAleatorios) {
            System.out.println(numeros + "");
        }

        System.out.println("Sucessores dos números aleatórios");
        for (int numeros : numerosAleatorios) {
            System.out.println((numeros + 1) + "");
        }
    }
}