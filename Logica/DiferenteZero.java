import java.util.Scanner;

public class DiferenteZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero base: ");
        int base = scanner.nextInt();
        while (true) {
            System.out.println("Informe um numero para verificação: ");
            int valor = scanner.nextInt();
            if (valor < base) {
                System.out.println("Você tem que informar um valor maior que " + base);
                continue;
            }

            int resto = base % valor;
            if (resto != 0) {
                break;
            }
        }
    }
}