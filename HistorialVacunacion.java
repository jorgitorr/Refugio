package refugio;


import java.util.Map;
import java.util.TreeMap;

public class HistorialVacunacion {
    Map<Animal,Vacuna>historial;


    public HistorialVacunacion() {
        this.historial = new TreeMap<>();
    }

    public void addVacunaToDog(Perro perro, Vacuna vacuna){
        historial.put(perro,vacuna);
    }

    public void addVacunaToCat(Gato gato, Vacuna vacuna){
        historial.put(gato,vacuna);
    }

    public void getHistorialCat(Gato gato, Vacuna vacuna){
        System.out.println("----------- Historial de vacunación de: " + gato + "---------------");
        System.out.println(historial.get(gato));
    }

    public void showHistorialDog(Perro perro, Vacuna vacuna){
        System.out.println("----------- Historial de vacunación de: " + perro + "---------------");
        System.out.println(historial.get(perro));
    }


}
