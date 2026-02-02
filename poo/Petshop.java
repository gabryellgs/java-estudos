import java.util.Scanner;

// Classe que representa um Pet (animal que vai tomar banho)
class Pet {

    // atributo "nome" do pet - final = não pode ser alterado depois de criado
    private final String nome;

    // atributo que indica se o pet está limpo ou não
    private boolean limpo;

    // Construtor: método usado para criar um novo Pet
    // Quando criamos um Pet, passamos o nome e ele começa "sujo" (limpo = false)
    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false;
    }

    // Método para pegar (ler) o nome do pet
    public String getNome() {
        return nome;
    }

    // Método para verificar se o pet está limpo
    public boolean isLimpo() {
        return limpo;
    }

    // Método para mudar o estado de limpeza do pet
    // true = limpo, false = sujo
    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}

// Classe que representa a Máquina de banho do petshop
class Maquina {

    // Indica se a máquina está limpa ou suja
    private boolean limpo = true;

    // Quantidade de água disponível na máquina
    private int agua = 30;

    // Quantidade de shampoo disponível na máquina
    private int shampoo = 10;

    // Referência ao pet que está dentro da máquina no momento
    private Pet pet;

    // Método para dar banho no pet
    public void darBanhoPet() {

        // Se não tiver pet dentro, não pode dar banho
        if (this.pet == null) {
            System.out.println("coloque o pet na maquina para iniciar o banho!");
            return; // encerra o método aqui
        }

        // Consome 10 litros de água
        this.agua -= 10;

        // Consome 10 unidades de shampoo
        this.shampoo -= 10;

        // Marca o pet como limpo
        pet.setLimpo(true);

        // Exibe mensagem dizendo que o pet está limpo
        System.out.println("O pet " + pet.getNome() + " está limpo!");
    }

    // Método para adicionar água na máquina
    public void addAgua() {

        // Se já tiver 30, não pode adicionar mais
        if (agua == 30) {
            System.out.println("a capacidade de agua está no maximo!");
            return;
        }

        // Adiciona 2 litros de água
        agua += 2;
    }

    // Método para adicionar shampoo na máquina
    public void addShampoo() {

        // Se já tiver 10, não pode adicionar mais
        if (shampoo == 10) {
            System.out.println("a capacidade do shampoo está no maximo!");
            return;
        }

        // Adiciona 2 unidades de shampoo
        shampoo += 2;
    }

    // Método para ver quanta água tem na máquina
    public int getAgua() {
        return agua;
    }

    // Método para ver quanto shampoo tem na máquina
    public int getShampoo() {
        return shampoo;
    }

    // Método que retorna true se já tem um pet dentro da máquina
    public boolean hasPet() {
        return pet != null;
    }

    // Método para colocar um pet dentro da máquina
    public void setPet(final Pet pet) {

        // Se a máquina NÃO estiver limpa, ela está suja
        // Então não pode colocar outro pet
        if (!this.limpo) {
            System.out.println("A maquina está suja, para colocar o pet é necessaria limpa-lá");
            return;
        }

        // Se já tiver um pet dentro, não pode colocar outro
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getNome() + " está na maquina nesse momento!");
            return;
        }

        // Se passou por todas as verificações, coloca o pet na máquina
        this.pet = pet;
    }

    // Método para retirar o pet da máquina
    public void removePet() {
        this.limpo = this.pet.isLimpo();

        // Remove o pet (define como null = vazio)
        this.pet = null;
        System.out.println("O pet" + this.pet.getNome() + "está limpo!");
        this.pet = null;
    }

    public void banho(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A maquina está limpa");
    }
}

// Classe principal do programa
public class Petshop {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Maquina Maquina = new Maquina();
    // Método principal: é aqui que o programa começa a rodar
    public static void main(String[] args) {
        var opcao = -1;
        do{
            System.out.println("=== escolha uma das opcões ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer shampoo");
            System.out.println("3 - Abastecer água");
            System.out.println("4 - Verificar nivel da agua");
            System.out.println("5 - Verificar se tem pet no banho");
            System.out.println("6 - colocar pet na maquina");
            System.out.println("7 - Retirar pet na maquina");
            System.out.println("8 - limpar maquina");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();
            while (opcao !=0);

            switch (opcao) {
                case 7 -> setPetinMaquina();
            }
        }

        public void setPetinMaquina(){
            System.out.println("Informe o nome do seu pet");
            var nome = scanner.next();
            var pet = new pet(nome);
            Maquina = new Maquina(pet)
        }
    }
}
