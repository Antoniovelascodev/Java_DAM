package ejc_arrays;
import java.util.Scanner;
public class ejc6 {
	
/*
 Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */

	public static void main(String[] args) {	
	
		Scanner entrada = new Scanner (System.in); 
		
		int numero [] = new int [16];
		
		for ( int i = 1; i<15; i++) {
			System.out.println("Dime un numero: " + "(llevas "+ i +" )");
			int num = entrada.nextInt(); 
			if(i+1 == 15) {
				numero [0] = num; 
			}
			numero [i+1] = num;
		}
		for ( int i = 0; i<15 ; i++) {
			System.out.println("num " + " [" +numero[i]+"] ");	
		}
		}
}