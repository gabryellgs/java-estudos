import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite um numero maior: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite 1 para ver par ou 2 para ver impar");
        int escolha = scanner.nextInt();
        for(int i = primeiroNumero; i <= segundoNumero; i++){
            if (escolha == 1 ) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            else if (escolha == 2) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
