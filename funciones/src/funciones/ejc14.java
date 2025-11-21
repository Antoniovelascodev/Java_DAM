package funciones;
import java.util.Scanner; 
public class ejc14 {

	/*
	 * En este ejercicio se debe mostrar el mensaje «Ha ingresado un número de un dígito», 
	 * si el número ingresado esta en el rango del 1 al 9, si ingresa un número de 2 dígitos 
	 * mostrar el mensaje; «Ha ingresado un número de dos dígitos», de la misma manera si es de 3 dígitos.
	 * Crea una función que pasado el número devuelva el mensaje
	 */
	
	
	public static void Ingresanum(int num) {
		
		if(num>0 && num <10 ) {
			System.out.println("Ha ingresado un número de 1 digito");
		}else if(num >9 && num<100) {
			System.out.println("Ha ingresado un número de 2 digitos");
		}else if (num>99 && num<1000) {
			System.out.println("Ha ingresado un número de 3 digitos");
		}else {
			System.out.println("(Error) Supera los 3 dígitos o es negativo");
		}
		return; 
	}
	
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dime un número y te digo cuantos dígitos tiene: ");
		int a = entrada.nextInt(); 
		Ingresanum(a); 

	}
	
}
