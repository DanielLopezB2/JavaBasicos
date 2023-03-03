package ejercicios;


public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        //La serie de Fibonacci es una secuencia infinita de números naturales, se van sumando a pares, de
        //manera que cada número es igual a la suma de sus dos anteriores
        
        int n = 15;

        int num1 = 0, num2 = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        
    }
    
}
