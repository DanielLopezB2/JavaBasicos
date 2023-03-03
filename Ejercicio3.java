package ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static final double IVA= 0.19;
    
    public static void main(String[] args) {
        
        //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
        //precio final con IVA. El IVA sera una constante que sera del 19%.
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingrese el precio de un producto: $");
        double precio = ingreso.nextInt();
        
        double precioFinal = precio + (precio * IVA);
        
        System.out.print("El precio final del producto es: $"+precioFinal);

        
    }
    
}
