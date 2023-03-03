package ejercicios;

import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        //Pide por teclado un número entero positivo y muestra el número de cifras que tiene. Por
        //ejemplo: Si introducimos 1250, nos muestre que tiene 4 cifras.

        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = ingreso.nextInt();
        
        int cantidadCifras = String.valueOf(numero).length();
        
        
        System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
    }
    
}
