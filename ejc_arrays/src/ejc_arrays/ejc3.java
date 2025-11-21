package ejc_arrays;
import java.util.Scanner;
public class ejc3 {

	/* Ejercicio 3
	Escribe un programa que lea 10 números por teclado y que luego los muestre
	en orden inverso, es decir, el primero que se introduce es el último en
	mostrarse y viceversa.
	*/

		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in); 
			
			int numarray[] = new int[10]; 
			for (int i = 0; i<9 ; i++) {
				System.out.println("Dime un numero: ");
				int numeros = entrada.nextInt();
				 numarray[i] = numeros;   
			}
			
			for (int i = 10; i>=0 ; i--) {
				System.out.println(numarray[i]);
			}	
		}
	}
