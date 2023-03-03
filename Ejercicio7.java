package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        //Se tiene una lista con números enteros en cualquier orden, se requiere que imprima de menor a
        //mayor los números pares y posterior a esto imprima de menor a mayor los números impares.
        //Ejemplo:
        //V1 = {15, 7, 2, 1, 5, 9, 8, 7, 24, 50}
        //Resultado: 2, 8, 24, 50, 1, 5, 7, 7, 9, 15
        
        List<Integer> numeros = Arrays.asList(15, 7, 2, 1, 5, 9, 8, 7, 24, 50);
        List<Integer> numerosPar = new ArrayList<>();
        List<Integer> numerosImpar = new ArrayList<>();
        List<Integer> numerosOrden = new ArrayList<>();

        
        for (int i = 0; i < numeros.size(); i++) {
            int numeroPar = numeros.get(i);
            if (numeroPar % 2 == 0) {
                numerosPar.add(numeroPar);
                Collections.sort(numerosPar);
            }
        }
        
        for (int i = 0; i < numeros.size(); i++) {
            int numeroImpar = numeros.get(i);
            if (numeroImpar % 2 != 0) {
                numerosImpar.add(numeroImpar);
                Collections.sort(numerosImpar);
            }
        }
        
        numerosOrden.addAll(numerosPar);
        numerosOrden.addAll(numerosImpar);
        
        System.out.println(numerosOrden);
        
    }
    
}
