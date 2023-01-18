package estudos.douglas;
public class MinhaClasse {
    public static void main(String[] args) {
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]); 

        System.out.println("Meu nome é : " + nome);
        System.out.println("Meu sobrenome é : " + sobrenome);
        System.out.println("Minha idade é : " + idade);
        System.out.println("Minha altura é : " + altura);
    }
}
