package refugio;

public class Gato extends Animal{
    String nombre;
    VacunaGato dosis;

    public Gato(String nombre, int edad, String genero) {
        super(edad, genero);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato:" +
                "nombre='" + nombre + " " + genero +
                '}';
    }
}
