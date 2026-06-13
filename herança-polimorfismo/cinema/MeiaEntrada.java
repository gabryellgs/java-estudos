public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, String tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    @Override
    public double retornarValorReal() {
        return getValor() / 2;
    }
}