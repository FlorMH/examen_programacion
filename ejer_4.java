 package examen_programacion;
 import java.util.Arrays;
import java.util.Scanner;
public class ejer_4 {

    public static void main(String[] args) {

        try (// Pedir al usuario que ingrese el tamaño del arreglo
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el tamaño del arreglo: ");
			int n = sc.nextInt();

			// Declarar un arreglo de tamaño n
			int[] arreglo = new int[n];

			// Leer los elementos del arreglo
			System.out.println("Ingrese los elementos del arreglo:");
			for (int i = 0; i < n; i++) {
			    arreglo[i] = sc.nextInt();
			}

			// Ordenar el arreglo de menor a mayor
			Arrays.sort(arreglo);

			// Imprimir el arreglo ordenado
			System.out.println("El arreglo ordenado de menor a mayor es:");
			for (int i = 0; i < n; i++) {
			    System.out.print(arreglo[i] + " ");
			}
		} 
    }
    }
    
		
		
		
		
	
