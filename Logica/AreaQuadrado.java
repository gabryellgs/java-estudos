import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado:");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.println ("A área do quadrado é:" + area);
    }
}
