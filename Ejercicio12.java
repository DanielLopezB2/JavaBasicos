package ejercicios;

import java.util.*;

public class Ejercicio12 {
    
    public static List<Integer> aplicarPermutaciones(List<Integer> list, int numPermutaciones) {
        List<Integer> resultado = new ArrayList<>(list);
        for (int i = 0; i < numPermutaciones; i++) {
            
            for (int j = 0; j < list.size(); j++) {
                
                int anterior = (j == 0) ? 0 : list.get(j-1);
                int posterior = (j == list.size()-1) ? 0 : list.get(j+1);
                
                if (anterior == posterior) {
                    resultado.set(j, 0);
                } else {
                    resultado.set(j, 1);
                }
            }
            list = new ArrayList<>(resultado);
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, 1, 0, 0, 0, 1, 1);
        int numPermutaciones = 2;
        List<Integer> resultado = aplicarPermutaciones(list, numPermutaciones);
        System.out.println(resultado);
    }
}
