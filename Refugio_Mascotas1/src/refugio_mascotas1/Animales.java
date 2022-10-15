
package refugio_mascotas1;


//Clase padre
public class Animales {
    
    //Atributos
    private String nombre, raza, color;
    private int edad, id;

    //Constructor
    public Animales() {
    }

    //Constructor sobrecargado
    public Animales(String nombre, String raza, String color, int edad, int id) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.id = id;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }
    public int getEdad() {
        return edad;
    }   
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public int getId() {
        return id;
    }
    
    
}
