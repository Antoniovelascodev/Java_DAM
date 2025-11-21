package ejc_arrays;
import java.util.Random;
public class ejc4 {

	/*
Ejercicio 4
Define tres arrays de 20 números enteros cada uno, con nombres numero,
cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
array cuadrado se deben almacenar los cuadrados de los valores que hay en el
array numero. En el array cubo se deben almacenar los cubos de los valores que
hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas.
	 */
	
	public static void main(String[] args) {
		
		int numero []; 
		int cuadrado [];
		int cubo [];
		
		numero = new int [20];
		cuadrado = new int [20]; 
		cubo = new int [20]; 
		
		Random rdm = new Random(); 
		System.out.println("-----------------------");
		System.out.println("Numeros");
		System.out.println("");
		
		for ( int i = 0; i<20 ; i++) {
		numero [i] = rdm.nextInt(100); 
		System.out.println("El numero " + numero[i]);
		}
		
		System.out.println("-----------------------");
		System.out.println("Cuadrado");
		System.out.println("");
		
		for(int i = 0; i<20; i++ ) {
			cuadrado[i] = numero[i]*numero[i];
			System.out.println("El cuadrado de " +numero[i]+" es: " + cuadrado[i]);
		}
		
		System.out.println("-----------------------");
		System.out.println("Cubo");
		System.out.println("");
		
		for(int i = 0; i<20; i++ ) {
			cubo[i] = cuadrado[i]*numero[i];
			System.out.println("El cubo de " + numero[i]+" es: " + cubo[i]);
		}
		
		System.out.println("-----------------------");
		
	}
}