/*
 * Crie um vetor de 6 números inteiros
 * e mostrs-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5};
        int i;

        for( i = (vetor.length - 1); i >= 0; i--) {
            int resultado = vetor[i];
            System.out.println("Ordem inversa: " + resultado);
        }
    }
}