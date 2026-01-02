import java.util.Scanner;


public class ContaBancaria {

    static double saldo;
    static double limiteChequeEspecial;
    static double chequeUsado = 0;

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Criação da conta");
        System.out.println("Digite o valor do deposito inicial: ");
        double depositoInicial = scanner.nextDouble();
        if (depositoInicial <= 500) {
            limiteChequeEspecial = 50;
        } else{
            limiteChequeEspecial = depositoInicial * 0.5;
        }
        saldo = depositoInicial;
        
        int opcao;

        do{
            System.out.println("\n------ Menu bancário ------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultar();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 2:
                    chequeEspecial();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Digite o valor para deposito: ");
                    double valor = scanner.nextDouble();
                    depositar((valor));
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Sacar dinheiro: ");
                    double retirar = scanner.nextDouble();
                    sacar((retirar));
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Pagar boleto:");
                    double boleto = scanner.nextDouble();
                    pagarBoleto((boleto));
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 6:
                    verificarCheque();
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 0:
                    sair(scanner);
                    break;
                default:
                    System.out.println("Opcão invalida!");
            }
        } while (opcao != 0);
    }
    // case 1 - consultar o saldo da conta
    static void consultar(){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
    // case 2 - consultar o saldo do cheque especial
    static void chequeEspecial(){
        System.out.printf("saldo cheque especial: R$ %.2f%n", limiteChequeEspecial);
        System.out.printf("Cheque usado: R$ %.2f%n", chequeUsado);
        System.out.printf("Cheque disponivel: R$ %.2f%n", limiteChequeEspecial - chequeUsado);
    }
    // case 3 - depositar o dinheiro na conta
    static void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado!");
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        } else{
            System.out.println("valor invalido!");
        }
    }
    // case 4 - sacar o dinheiro da conta
    static void sacar(double retirar){
            if (retirar <= 0) {
                System.out.println("Valor invalido!");
                return;
            } 
            double limiteTotal = saldo + limiteChequeEspecial;
            if (retirar > limiteTotal) {
                System.out.println("Saldo Insuficiente!");
                return;
            }
            saldo -= retirar;
            if (saldo < 0) {
                chequeUsado = Math.abs(saldo);
            } else{
                chequeUsado = 0;
            }
            System.out.printf("Seu novo saldo é: R$ %.2f%n", saldo);
    }
    // case 5 - pagar o boleto com o saldo da conta
    static void pagarBoleto(double valor){
        if(valor <= 0){
            System.out.println("Valor invalido!");
            return;
        }
        double limiteTotal = saldo + limiteChequeEspecial;
        if (valor > limiteTotal) {
            System.out.println("Saldo insuficiente para o boleto!");
            return;    
        }
        saldo -= valor;
        if (saldo < 0) {
            chequeUsado = Math.abs(saldo);
        } else{
            chequeUsado = 0;
        }
        System.out.println("Boleto pago com sucesso!");
        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
    }
    // case 6 - verificar o saldo do cheque especial
    static void verificarCheque(){
        System.out.println("Saldo do cheque especial: " + limiteChequeEspecial);
    }
    // case 0 - sair do programa
    static void sair(Scanner scanner){
        System.out.println("Encenrrando o programa...");
        scanner.close();
    }

}