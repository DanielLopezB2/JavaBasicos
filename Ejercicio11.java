package ejercicios;


public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        //Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total.
        
        String cadena = "La lluvia en Sevilla es una maravilla";
        int contadorVocales = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contadorVocales++;
            }
        }
        
        System.out.println("El número de vocales en el texto es: " + contadorVocales);
        
    }
    
}
