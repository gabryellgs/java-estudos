import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a base do retangulo: ");
        int base = scanner.nextInt();
        System.out.println("informe a altura do retangulo: ");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.println("A área dp retangulo é:" + area);
    }
}
