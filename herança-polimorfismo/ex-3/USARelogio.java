public non-sealed class USARelogio extends Relogio {

    private String periodoIndicador;


    public String getPeriodoIndicador() {
        return periodoIndicador;
    }

    public void setAposMeiodia() {
        this.periodoIndicador = "PM";
    }
    public void setAntesMeiodia() {
        this.periodoIndicador = "AM";
    }

    public void setHoras(int horas) {
        
        setAntesMeiodia();

        if((horas >= 12) && (horas <= 23)){
            setAposMeiodia();
            this.horas = horas - 12;

        } else if(horas >= 24){          
            this.horas = 0;
        
        } else{
            this.horas = horas;
        }
        
    }

    @Override
    public Relogio convert(Relogio relogio) {
        this.minutos = relogio.getMinutos();
        this.segundos = relogio.getSegundos();

        switch (relogio) {
            case USARelogio relogioUSA -> {
                this.horas = relogioUSA.getHoras();
                this.periodoIndicador = relogioUSA.getPeriodoIndicador();
            }
            case BRLRelogio relogioBRL ->
                this.setHoras(relogioBRL.getHoras());
            default ->
                this.setHoras(relogio.getHoras());
        }

        return this;
    }

    public String getTempo(){
        return super.getTempo() + " " + this.periodoIndicador;
    }
    
}
