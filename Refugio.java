package refugio;

import java.util.*;

public class Refugio{
    Queue<Gato> refugioGatos;
    Queue<Perro> refugioPerros;
    Set<Animal>historialAnimales;
    Scanner sc;

    public Refugio() {
        this.refugioGatos = new LinkedList<Gato>();
        this.refugioPerros = new LinkedList<Perro>();
        this.historialAnimales = new TreeSet<>();
        sc = new Scanner(System.in);
    }

    public void entraAnimal(Animal animal){
        String gender, nombre;
        System.out.println("What kind of animal it's(G/P)");
        String tipo = sc.nextLine().toUpperCase();
        if(tipo.equals("G")){
            System.out.println("What it's the name of the cat?");
            nombre = sc.nextLine();
            refugioGatos.add(new Gato(nombre,animal.edad, animal.genero));
            System.out.println("Entra->Gato:" + nombre);
            historialAnimales.add(new Gato(nombre,animal.edad, animal.genero));
        }else if(tipo.equals("P")){
            System.out.println("What it's the name of the dog?");
            nombre = sc.nextLine();
            refugioPerros.add(new Perro(nombre, animal.edad, animal.genero));
            System.out.println("Entra-> Perro: " + nombre);
            historialAnimales.add(new Perro(nombre, animal.edad, animal.genero));
        }else{
            System.out.println("Wrong answer");
        }
    }

    public Animal getAnimal(){
        if(refugioGatos.peek().edad>refugioGatos.peek().edad){
            return refugioGatos.peek();
        }else{
            return refugioPerros.peek();
        }
    }

    public Animal adoptaPerro(){
        System.out.print("Sale->");
        return refugioPerros.poll();
    }

    public Animal adoptaGato(){
        System.out.print("Sale->");
        return refugioGatos.poll();
    }


    protected Animal getGato(){
        return refugioGatos.peek();
    }

    protected Animal getPerro(){
        return refugioPerros.peek();
    }

    public void adoptAll(){
        for (int i = 0; i < refugioGatos.size(); i++) {
            refugioGatos.poll();
        }
        for (int i = 0; i < refugioPerros.size(); i++) {
            refugioPerros.poll();
        }
    }

    public void setVacunaToCat(Gato gato, Vacuna vacuna){
        HistorialVacunacion historial = new HistorialVacunacion();
        historial.addVacunaToCat(gato,vacuna);
    }

    protected Set getHistorialAnimales(){
        return historialAnimales;
    }







}
