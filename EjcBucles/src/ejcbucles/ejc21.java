package ejcbucles;
import java.util.Scanner;
public class ejc21 {

	
/*	 Ejercicio 21:Realiza un programa que sume los 100 números siguientes a un número entero 
	 positivo introducido por teclado. Se debe comprobar que el dato introducido
	 es correcto (que es un número positivo).
*/ 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dime un numero y le hago la suma de los siguientes 100 numeros");
		int numero = entrada.nextInt(); 
		
		int ac = 0; 
		int suma = 0;  
		
		if(numero <= 0){
			System.out.println("Debes introducir un numero positivo: ");
		}else {
		
		
		for (int i = numero ; i<numero+100 ; i++ ) {
			
			ac = i + numero; 
			System.out.println("la suma de "+ numero +" + " + i +  " es " + ac);
			suma = suma + i; 
		}
		System.out.println("Este es el total "+ suma);
		}
	}
	
}
