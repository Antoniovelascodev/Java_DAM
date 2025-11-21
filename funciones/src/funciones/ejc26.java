package funciones;
import java.util.Scanner;
public class ejc26 {

	/* Crea un método que compruebe si un número es simétrico. Los números simétricos son iguales a partir del dígito 
	 * central pero comparando en dirección opuesta
	 * //ejemplo: num = 12321 -> true

	 */
	
	public static void numAlreves(int num) { 
		
		int a = num; 
		int j =0;
		int numalreves = 0; 
		
		while(a>0) {
			
			j = a %10;
			numalreves = numalreves*10+j;
			a = a/10; 
		}
		
		System.out.println(numalreves);
		
		if(numalreves == num) {
		
			System.out.println("Es palindromo");
		}else{
			System.out.println("No es palíndromo");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Dime un numero y te digo si es palíndromo o no ");
		Scanner entrada = new Scanner(System.in); 
		int k = entrada.nextInt(); 
		numAlreves(k); 
	
	}
}
