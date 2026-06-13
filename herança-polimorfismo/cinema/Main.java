public class Main {
    public static void main(String[] args) {

        Ingresso ingresso1 = new MeiaEntrada(
                20.0,
                "Minecraft: O Filme",
                "Dublado"
        );

        Ingresso ingresso2 = new IngressoFamilia(
                20.0,
                "Como Treinar o Seu Dragão",
                "Legendado",
                4
        );

        System.out.println("=== MEIA ENTRADA ===");
        System.out.println("Filme: " + ingresso1.getNomeFilme());
        System.out.println("Tipo de áudio: " + ingresso1.getTipoAudio());
        System.out.println("Valor final: R$ " + ingresso1.retornarValorReal());

        System.out.println();

        System.out.println("=== INGRESSO FAMÍLIA ===");
        System.out.println("Filme: " + ingresso2.getNomeFilme());
        System.out.println("Tipo de áudio: " + ingresso2.getTipoAudio());
        System.out.println("Valor final: R$ " + ingresso2.retornarValorReal());
    }
}