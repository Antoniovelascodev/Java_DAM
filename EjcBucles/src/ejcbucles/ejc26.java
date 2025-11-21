package ejcbucles;

import java.util.Scanner;

public class ejc26 {

	public static void main(String[] args) {

		System.out.println("Dime un numero y te le doy la vuelta ");
		Scanner entrada = new Scanner(System.in); 
		int num = entrada.nextInt() ; 
		
		int numAlreves = 0; 
		int i = 0; 
		
		while(num>0) {
			
			i = num % 10; // esto es para que de el resto del numero, todos los numeros que se hagan en %10 saldrá el del final siempre 
			numAlreves = numAlreves*10+i; // le asigna a numAlreves el valor de i mas el valor que tenía  
			num = num/10; // esto hace que se elimine el último número introducido para pasar al siguiente 
			
		}
		System.out.println("___________");
		System.out.println("");
		System.out.println(numAlreves);
		
	}

}
