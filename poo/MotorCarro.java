import java.util.Scanner;

class Carro{
    boolean ligado;
    int velocidade;
    int marcha;

    Carro(){
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }
    void ligar(){
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado");
        }
    }
    void desligar(){
        if (ligado && velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("carro desligado");
        
        } else{
            System.out.println("carro não pode desligar");
        }
    }

    void acelerar(){
        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }
        
        if (marcha == 0) {
            System.out.println("ponto morto não pode acelerar");
            return;
        }
        if (podeAcelerar()) {
            velocidade++;
        } else {
            System.out.println("Troque a marcha");
        }
        
    }
    void diminuirVelocidade(){
        if (!ligado) {
            System.out.println("Carro desligado");
            return;            
        }
        if (velocidade > 0) {
            velocidade--;      
        }
    }
    void trocarMarcha( int novaMarcha){
        if (!ligado) {
            System.out.println("Carro desligado");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha invalida");
            return;
        }
        if (novaMarcha != 0 && Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marcha");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha trocada para " + marcha);
    }
    void virarEsquerda(){
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando a esquerda");
        } else{
            System.out.println("Velocidade incompativel");
        }
    }
    void virarDireita(){
        if (ligado && velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando a direita");
        } else{
            System.out.println("Velocidade incompátivel");
        }
    }
    void verificarVelocidade(){
        System.out.println("Sua velocidade é: " + velocidade + "Km/h");
    }
    boolean podeAcelerar(){
        return switch (marcha) {
            case 1 -> velocidade < 20;
            case 2 -> velocidade >= 20 && velocidade < 40;
            case 3 -> velocidade >= 40 && velocidade < 60;
            case 4 -> velocidade >= 60 && velocidade < 80;
            case 5 -> velocidade >= 80 && velocidade < 100;
            case 6 -> velocidade >= 100 && velocidade < 120;
            default -> false;
        };
    }
}

public class MotorCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao;
        do{
            System.out.println("--- Menu ---");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5- Trocar marcha");
            System.out.println("6 -ver velocidade");
            System.out.println("0 - sair");
            opcao= scanner.nextInt();
            switch (opcao) {
                case 1:
                    carro.ligar();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();

                    break;
                case 2:
                    carro.desligar();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    carro.acelerar();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Digite a marcha: 0 a 6");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 6:
                    carro.verificarVelocidade();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                default:
                    System.out.println("opcão invalida");
                    break;
            }
        } while(opcao != 0);
        
    }
}