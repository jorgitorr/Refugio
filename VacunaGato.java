package refugio;

public enum VacunaGato implements Vacuna {
    HERPES("Moquillo canino",true,36),
    CALIVIVIRUS("Calicivirus",true,36),
    PANLEUCOPENIA("Panleucopenia Felina",true,36),
    FCORONAVIRUS("Coronavirus",false,0),
    LEPTOSPIRA("Peritonitis Infecciosa Felina",false,12);


    private String nombre;
    private boolean esencial;
    private int revacunacion;

    VacunaGato(String nombre, boolean esencial, int revacunacion) {
        this.nombre = nombre;
        this.esencial = esencial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public boolean esEsencial() {
        return this.esencial;
    }
}
