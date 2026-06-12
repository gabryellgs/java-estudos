import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite um numero maior: ");
        int segundoNumero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite 'par' ou 'impar': ");
        String escolha = scanner.nextLine().toLowerCase();

        if (!escolha.equals("par") && !escolha.equals("impar")) {
            System.out.println("Opção invalida! digite apenas 'par' ou 'impar' ");
            return;
        }
        for(int i = primeiroNumero; i <= segundoNumero; i++){
            if (!escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            }
            if (!escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
