package refugio;


public class Animal implements Comparable<Animal>{
    int edad;
    String genero;

    public Animal(int edad, String genero) {
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public int compareTo(Animal animal) {
        int salida = 0;

        if(this.edad < animal.edad){
            salida = -1;
            if(this.genero.equals("M")&&animal.genero.equals("H")){
                salida = -1;
            }else{
                salida = 0;
            }
        }

        return salida;
    }


}
