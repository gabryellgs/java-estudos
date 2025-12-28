import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();
        System.out.println("Digite a sua altura: ");
        float altura = scanner.nextFloat();
        float imc = peso/(altura * altura);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal!");
        }
        else if(imc >=25 && imc <=29.9){
            System.out.println("Levemente acima do peso!");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        }
        else if(imc >= 35 && imc <=39.9){
            System.out.println("Obesidade Grau 2 (Severa!)");
        }
        else{
            System.out.println("Obesidade Grau 3 (Mórbita!)");
        }
    }
}
