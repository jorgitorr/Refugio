package refugio;

import java.util.Scanner;

public class PruebaRefugio {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        Refugio refugio = new Refugio();
        int edad;
        String genero;
        for (int i = 0; i < 10; i++) {
            System.out.println("How old it is? ");
            edad = write.nextInt();
            write.nextLine();
            System.out.println("Which genre?(M -> macho/H -> hembra)");
            genero = write.nextLine().toUpperCase();
            refugio.entraAnimal(new Animal(edad,genero));
        }

        System.out.println(refugio.adoptaGato());
        System.out.println(refugio.adoptaGato());
        System.out.println(refugio.adoptaGato());
        System.out.println(refugio.adoptaPerro());

        try{
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        HistorialVacunacion historial = new HistorialVacunacion();
        //historial.addVacunaToCat(new Gato("Gardfield",3,"M"));

        //adopta todos los animales
        refugio.adoptAll();

        System.out.println(refugio.getHistorialAnimales());
    }
}
