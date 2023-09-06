package pkg01_diegoavendaño;

import java.util.Scanner;

//By: Diego Alonso AVENDAÑO CARDENAS

public class Calculadora {
    
//atributos
    int a;
    int b;
    int totalSuma;
    int totalResta;
    int totalMultiplicar;

//metodo 
    public void sumar() {
    totalSuma = a + b;
}

public void restar() {
    totalResta = a - b;
}

public void multiplicar() {
    totalMultiplicar = a * b;
}

public void preguntar() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el valor a:");
    a = scanner.nextInt();
    System.out.println("Ingrese el valor b:");
    b = scanner.nextInt();
}

public void mostrarValores() {
    System.out.println("La suma es " + totalSuma);
    System.out.println("La resta es " + totalResta);
    System.out.println("La multiplicación es " + totalMultiplicar);
}

public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    calculadora.preguntar();
    calculadora.sumar();
    calculadora.restar();
    calculadora.multiplicar();
    calculadora.mostrarValores();
}
}

