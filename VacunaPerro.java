package refugio;

public enum VacunaPerro implements Vacuna{
    MOQUILLO("Moquillo canino",true,36),
    PARVOVIRUS("Parvovirus canino",true,36),
    RABIA("Rabia",true,12),
    ADENOVIRUS("Adenovirus canino tipo I y II",true,36),
    CCORONAVIRUS("Coronavirus",false,0),
    LEPTOSPIRA("Leptopirosis",false,12);

    private String nombre;
    private boolean esencial;
    private int revacunacion;

    VacunaPerro(String nombre, boolean esencial, int revacunacion) {
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
