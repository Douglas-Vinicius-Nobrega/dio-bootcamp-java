import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 5;
        int count = 5;

        System.out.println("Digite o número: ");
        int numero = scan.nextInt();

        for (int i = 0; i <= fatorial; i++) {
            int resultado = numero * count;
            count--;
            System.out.println("O fatorial do número " + numero + " é : " + resultado);
        }
    }
}
