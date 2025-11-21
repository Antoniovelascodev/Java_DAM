package ejcbucles;

import java.util.Scanner;

public class ejcinventado {

	public static void main(String[] args) {

		//coge numero y suma sus digitos y devuelve la suma 
		
		System.out.println("Dime un numero y le hago una suma a sus digitos");
		Scanner entrada = new Scanner(System.in); 
		int num = entrada.nextInt(); 
		
		int i = 0;
		int numgen = 0; 
		int numsuma=0; 
		
		while(num>0) {
			
			i = num % 10; 
			num = num/10;
			numgen+=i;
			
		}
		System.out.println("La suma es "+ numgen);	
	}
}
