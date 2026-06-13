public non-sealed class BRLRelogio extends Relogio {

    @Override
    public Relogio convert(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getMinutos();

        switch (relogio) {
            case USARelogio relogioUSA ->
                this.horas = relogioUSA.getPeriodoIndicador().equals("PM") ?
                    relogioUSA.getHoras() + 12 : relogioUSA.getHoras();
            case BRLRelogio relogioBRL ->
                this.horas = relogioBRL.getHoras();
            default ->
                this.horas = relogio.getHoras();
        }

        return this;
    }
    
}
