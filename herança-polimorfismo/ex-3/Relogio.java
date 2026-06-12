public sealed abstract class Relogio permits USARelogio, BRLRelogio {

    protected int horas;
    protected int minutos;
    protected int segundos;

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        if(horas >= 24){
            this.horas = 24;
            return;
        }

        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        if(minutos >= 60){
            this.minutos = 60;
            return;
        }
        this.minutos = minutos;
    }
    public int getSegundos() {
        if(segundos >= 60){
            this.segundos = 60;
            return segundos;
        }
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    private String formato(int valor){
        return valor < 10 ? "0" + valor : String.valueOf(valor);
    }

    public String getTempo() {
        return String.format("%s:%s:%s", formato(horas), formato(minutos), formato(segundos));
    }

    abstract Relogio convert(Relogio relogio);
}
