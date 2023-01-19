import java.util.Locale;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while(true) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
    
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Se quiser sair, digite: 0");
            int parar = scanner.nextInt();
            if (parar == 0) break;
            
        }



    }
}