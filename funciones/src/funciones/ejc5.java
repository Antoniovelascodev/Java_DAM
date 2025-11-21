package funciones;
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
		
		
		int numscanner = 0; 
		
		int numero [] = new int[10];  
				
		for (int i = 1; i<11; i++) {
			System.out.println("dime otro numero: ");
			int numentr = entrada.nextInt() ;
				numero [i]= numentr;  
		}
		
		
	}
}