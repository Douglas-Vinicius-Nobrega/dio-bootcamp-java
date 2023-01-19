package laços_repeticao.nota;

import java.util.Locale;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Vamos verificar sua nota!");

        System.out.println("Digite sua primeira nota: ");
        int nota = scanner.nextInt();

        while(nota > 10 || nota < 0) {
            System.out.println("Nota inválida, por favor digite a nota correta!");
            nota = scanner.nextInt();

        }

    }
}
