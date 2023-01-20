import java.util.Locale;
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in).useLocale(Locale.US);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Digite um número: ");
             numero = scan.nextInt();

             soma = soma + numero;
             
             if (numero > maior) maior = numero;
             
             count++;
            } while(count < 5);
            
            System.out.println("Maior: " + maior);
            System.out.println("Média: " + (soma/5));

    }
}
