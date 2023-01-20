import java.util.Scanner;

public class Tabuada {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.println("Digite o número da sua escolha: ");
        int numero = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * count;
            System.out.println(numero + "x" + count + "=" + resultado);
            count++;
        }
    }
}
        