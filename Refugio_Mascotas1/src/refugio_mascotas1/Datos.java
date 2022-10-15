package refugio_mascotas1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Datos {

    //ArrayLists
    private ArrayList<Canino> digimones = new ArrayList<>(); // caninos
    private ArrayList<Felino> pokemones = new ArrayList<>(); // felinos
    private int idC = 0;
    private int idF = 0;

    //Metodo para agregar caninos
    public void agregarAnimal() {

        //add lista con los objetos dentro
        String opcion = JOptionPane.showInputDialog(null, "Canino o felino");
        if (opcion.equals("canino")) {
            digimones.add(new Canino(JOptionPane.showInputDialog("Ingresar nombre"),
                    JOptionPane.showInputDialog("Ingresar raza"),
                    JOptionPane.showInputDialog("Ingresar color"),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad")),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingresar nivel de entrenamiento")),
                    idC));
            this.idC++;
        } else if (opcion.equals("felino")) {
            pokemones.add(new Felino(JOptionPane.showInputDialog("Ingresar nombre"),
                    JOptionPane.showInputDialog("Ingresar raza"),
                    JOptionPane.showInputDialog("Ingresar color"),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad")),
                    Boolean.parseBoolean(JOptionPane.showInputDialog("¿El felino se encuentra libre de Toxoplasmosis? (colocar 0 o 1)")),
                    idF));
            this.idF++;
        } else {
            JOptionPane.showMessageDialog(null, "input incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            agregarAnimal();
        }
    }
    //Metodo para eliminar elemento de la lista
    public void eliminarAnimal() {
        for (Canino canino: digimones){
            System.out.println(canino.getNombre() + " " + canino.getId());
        }
        String seleccion = JOptionPane.showInputDialog(null, "Canino o felino");
        if (seleccion.equals("canino")) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del canino"));
            Canino seleccionado = null;
            for (Canino canino : digimones) {
                if (id == canino.getId()) {
                    seleccionado = canino;
                }
            }
            digimones.remove(seleccionado);
            this.idC--;
            for (int i = 0; i < this.idC; i++) {
                digimones.get(i).setId(i);
            }
        } else if (seleccion.equals("felino")) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del canino"));
            Felino seleccionado = null;
            for (Felino felino : pokemones) {
                if (id == felino.getId()) {
                    seleccionado = felino;
                }
            }
            pokemones.remove(seleccionado);
            this.idF--;
            for (int i = 0; i < this.idF; i++) {
                pokemones.get(i).setId(i);
            }
        } else {
            eliminarAnimal();
        }
        for (Canino canino: digimones){
            System.out.println(canino.getNombre());
        }
    }

    public ArrayList<Canino> getDigimones() {
        return digimones;
    }

    public ArrayList<Felino> getPokemones() {
        return pokemones;
    }

    public int getIdC() {
        return idC;
    }

    public int getIdF() {
        return idF;
    }
    

}
