package examen_programacion;
import java.util.Scanner;
public class eje_2{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
      
        String frase = leer.nextLine();
        
        String Frase = null;
		System.out.println("El tamaño de la frase es: " + Frase);
        
        String fraseInvertida = invertirFrase(frase);
        int tamanoFrase1 = fraseInvertida.length();
        
        System.out.println("La frase invertida es: " + fraseInvertida);
        System.out.println("El tamaño de la frase es: " + tamanoFrase1);
    }
    
    public static String invertirFrase(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        return fraseInvertida;
    }
}
