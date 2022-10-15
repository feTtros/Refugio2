
package refugio_mascotas1;


//Clase hija
public class Felino extends Animales{
    
    //Atributos
    private boolean toxo;
    
    //Constructor
    public Felino(boolean toxo) {
        this.toxo = toxo;
    }
    
    //Constructor sobrecargado
    public Felino(String nombre, String raza, String color, int edad, boolean toxo, int id) {
        super(nombre, raza, color, edad, id);
        this.toxo = toxo;
    }

    //Setters
    public void setToxo(boolean toxo) {
        this.toxo = toxo;
    }    
    //Getters
    public boolean isToxo() {
        return toxo;
    }    
           
    
}
