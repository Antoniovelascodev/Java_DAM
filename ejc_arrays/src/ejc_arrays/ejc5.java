package ejc_arrays;
import java.util.Scanner; 
public class ejc5 {

/*
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente. 
 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int array[] = new int[11] ; 
		int numeromax = Integer.MIN_VALUE;  
		int numeromin = Integer.MAX_VALUE;  
		
		for ( int i = 1; i<11 ; i++) {
			System.out.println("Dime 10 numeros y te digo cual es el maximo y minimo, (numero " + i + ")");
			int numeros = entrada.nextInt(); 		 
			
			array [i] = numeros; 
			
			if (array[i] >= numeromax) {
				numeromax = array[i];
			}
			
			if (array[i] <= numeromin) {
				numeromin = array[i];  
			}
		}
		
		for ( int i = 1; i<11 ;i++) {
			System.out.println(array[i]);
			
			if (array[i] == numeromin) {
				System.out.print(" es el mínimo");
				System.out.println(""); 
			}
			
			if (array[i] == numeromax) {
				System.out.print(" es el máximo");
				System.out.println("");
			}
		}
	}
}