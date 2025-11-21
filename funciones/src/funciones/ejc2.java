package funciones;
import java.util.Scanner;
public class ejc2 {

	// Escribe una función que pasado dos números, escriba los números intermedios entre ellos.
	
	public static void numerosEntreAyB(int a , int b){
		
		if (a>b) {
			
			System.out.println("Los numeros entre " + a + " y " + b + " son " );
			for (int i = b+1; i <a ; i++) {
				System.out.println(i);
			}
			
		}else if (a<b){
			
			System.out.println("Los numeros entre " + a + " y " + b + " son " );
			for (int i = a+1; i <b  ; i++) {
				System.out.println(i);
		}
		}else {
			System.out.println("Los numeros son iguales");
		}
	}	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dime un numero: ");
		int a = entrada.nextInt(); 
		System.out.println("Dime otro numero: ");
		int b = entrada.nextInt(); 
		numerosEntreAyB (a,b); 
		entrada.close();
	}
}
