
package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //Dados tres números enteros, compare e imprima el mayor de ellos. 
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numeroUno = ingreso.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numeroDos = ingreso.nextInt();
        
        System.out.print("Ingrese el tecer número entero: ");
        int numeroTres = ingreso.nextInt();
        
        if (numeroUno > numeroDos && numeroUno > numeroTres) {
            
            System.out.print("El número mayor es: "+numeroUno);
            
        }
        
        else if (numeroDos > numeroUno && numeroDos > numeroTres ) {
            
            System.out.print("El número mayor es: "+numeroDos);
            
        }
        
        else if (numeroTres > numeroUno && numeroTres > numeroDos ) {
            
            System.out.print("El número mayor es: "+numeroTres);
            
        }
        
        else if (numeroUno == numeroDos) {
            
            System.out.print("El número: "+numeroUno+", es igual a el número: "+numeroDos);
            
        }
        
        else if (numeroUno == numeroTres) {
            
            System.out.print("El número: "+numeroUno+", es igual a el número: "+numeroTres);
            
        }
        
        else if (numeroDos == numeroTres) {
            
            System.out.print("El número: "+numeroDos+", es igual a el número: "+numeroTres);
            
        }
        
        
    }
    
}
