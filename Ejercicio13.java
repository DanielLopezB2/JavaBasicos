package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in);

        int numero = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTodos = 0;
        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;

        while (numero != -1) {
            System.out.print("Ingrese un número (-1 para salir): ");
            numero = ingreso.nextInt();

            if (numero != -1) {
                numeros.add(numero);

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

                sumaTodos += numero;
                cantidadNumeros++;

                if (numero % 2 == 0) {
                    cantidadPares++;
                } else {
                    cantidadImpares++;
                }
            }
        }

        System.out.println("Listado de los números introducidos: " + numeros);
        System.out.println("Mayor número introducido: " + mayor);
        System.out.println("Menor número introducido: " + menor);
        System.out.println("Suma de todos los números: " + sumaTodos);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        System.out.println("Media de los números ingresados: " + (double) sumaTodos / cantidadNumeros);
        
    }
    
}
