import java.util.Scanner;

public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nomePessoa1 = scanner.next();
        System.out.println("informe sua idade: ");
        var idade1 = scanner.nextInt();
        System.out.println("Informe seu nome: ");
        var nomePessoa2 = scanner.next();
        System.out.println("informe sua idade: ");
        var idade2 = scanner.nextInt();
        if (idade1 > idade2){
        System.out.println(nomePessoa1 + " é mais velho");
        } else if (idade2 > idade1){
        System.out.println(nomePessoa2 + " é mais velho");
        } else {
        System.out.println("eles tem a mesma idade");
        }
    }
}

