abstract class Ingresso {
    private double valor;
    private String nomeFilme;
    private String tipoAudio;

    public Ingresso(double valor, String nomeFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getTipoAudio() {
        return tipoAudio;
    }

    public void setTipoAudio(String tipoAudio) {
        this.tipoAudio = tipoAudio;
    }

    public abstract double retornarValorReal();
}