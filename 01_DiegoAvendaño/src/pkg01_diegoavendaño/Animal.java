package pkg01_diegoavendaño;

import javax.swing.JOptionPane;

//By: Diego Alonso AVENDAÑO CARDENAS

public class Animal {
    
    // Atributos
    private String nombre;
    private String tipo;
    
    // Constructor
    public void Animal() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal: ");
        tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo del animal: ");
    }
    
    // Método
    public void consultar() {
        JOptionPane.showMessageDialog(null, "El animal se llama " + nombre +  " es del tipo " + tipo);
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.consultar();
    }

}
