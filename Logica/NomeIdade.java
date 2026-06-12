import java.util.Scanner;

public class NomeIdade {
        public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();
        System.out.println("Qual é a sua idade?");
        int idade  = scanner.nextInt();
        System.out.println("Olá, " + nome + " você tem " + idade + " anos.");
        }
}
