
package refugio_mascotas1;


//Clase hija
public class Canino extends Animales {
    
    //Atributos
    private int nivelE;
    
    //Constructor
    public Canino() {
    }
        
    //Constructor sobrecargado
    public Canino(String nombre, String raza, String color, int edad, int nivelE,int id) {
        super(nombre, raza, color, edad, id);
        this.nivelE = nivelE;
    }    
    
    //Setters
    public void setNivelE(int nivelE) {
        this.nivelE = nivelE;
    }
    //Getters
    public int getNivelE() {
        return nivelE;
    }
        
    
}
