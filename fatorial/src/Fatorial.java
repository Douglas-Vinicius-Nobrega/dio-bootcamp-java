import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicador = 1;

        System.out.println("Digite o número: ");
        int fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicador = multiplicador * i;
        }
        System.out.println("O fatorial do número " + fatorial + " é : " + multiplicador);
    }
}
