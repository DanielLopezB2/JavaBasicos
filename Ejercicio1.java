package ejercicios;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        
        //Dado un número de entrada, determine si este es par o impar, imprima el resultado en la consola
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        
        int numero = ingreso.nextInt();
        
        if (numero % 2 == 0) {
            
            System.out.print("El número: "+numero+", es par.");
            
        } else {
            
            System.out.print("El número: "+numero+", es impar.");
            
        }
        
    }
    
}
