public class Main {
    public static void main(String[] args) {
        Relogio BRLRelogio = new BRLRelogio();
        BRLRelogio.setMinutos(0);
        BRLRelogio.setSegundos(0);
        BRLRelogio.setHoras(25);

        System.out.println("Relógio BRL: " + BRLRelogio.getTempo());
        System.out.println("Relógio USA: " + new USARelogio().convert(BRLRelogio).getTempo());
    }
}
