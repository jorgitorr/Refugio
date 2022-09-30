package refugio;

public class Perro extends Animal{
    String nombre;


    public Perro(String nombre, int edad, String genero) {
        super(edad, genero);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + " " + genero +
                '}';
    }
}
