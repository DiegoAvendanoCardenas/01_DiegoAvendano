package pkg01_diegoavendaño;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

//By: Diego Alonso AVENDAÑO CARDENAS
    public static void main(String[] args) {

        //Comandos para la clase de Calculadora
        Calculadora objCalculadora1 = new Calculadora();

        objCalculadora1.preguntar();
        objCalculadora1.sumar();
        objCalculadora1.restar();
        objCalculadora1.multiplicar();
        objCalculadora1.mostrarValores();

        //Comandos para la clase de Persona
        persona persona = new persona();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        persona.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        persona.edad = scanner.nextInt();

        persona.hablar();
        persona.orden();

        // Comandos de la clase de Auto
        Auto miAuto = new Auto();

        miAuto.Auto();
        miAuto.acelerar();

        //Comandos de la clase de Animal
        Animal animal = new Animal();

        animal.Animal();
        animal.consultar();

    }

}
