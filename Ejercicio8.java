package ejercicios;

import java.util.Scanner;


public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        //Pide un número por teclado e indica si es un número primo o no
        
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = ingreso.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
        
    }
    
}
