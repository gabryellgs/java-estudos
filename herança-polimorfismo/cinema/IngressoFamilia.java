public class IngressoFamilia extends Ingresso {
    private int quantidadePessoas;

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double retornarValorReal() {
    double valorTotal = getValor() * quantidadePessoas;

    if (quantidadePessoas > 3) {
        valorTotal = valorTotal * 0.95;
    }

    return valorTotal;
}

    public IngressoFamilia(double valor, String nomeFilme, String tipoAudio, int quantidadePessoas) {
        super(valor, nomeFilme, tipoAudio);
        this.quantidadePessoas = quantidadePessoas;
    }
}
