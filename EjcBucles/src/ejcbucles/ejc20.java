package ejcbucles;

import java.util.Scanner;

public class ejc20 {


	/*Ejercicio 20:Escribe un programa que dados dos números, uno real (base) y un entero
	positivo (exponente), saque por pantalla todas las potencias con base el
	número dado y exponentes entre uno y el exponente introducido.
	*/
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero ");		
		int base = entrada.nextInt();	
		System.out.println("Dime un numero exponente");	
		int exponente = entrada.nextInt();
		
		if(exponente<0) {
			System.out.println("No se puede negativos");
		}
		
		for(int i = 0 ; i<exponente; i++ ) {

			System.out.println("El número " +base+" elevado a " + i + " da: " + Math.pow(base, i)); 
		}
	}
}
