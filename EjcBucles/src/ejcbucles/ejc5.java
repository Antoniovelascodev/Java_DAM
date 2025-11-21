package ejcbucles;
import java.util.Scanner;
import java.util.Random;
public class ejc5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		Random random = new Random(); 
		System.out.println("Debes introducir la suma de dos números aleatorios");
		int numRandom1 = random.nextInt(100); 
		System.out.println("El primer número es " + numRandom1);
		int numRandom2 = random.nextInt(100); 
		System.out.println("El segundo número es " + numRandom2);
		System.out.println("Dime la suma: ");
		int sumausuario= entrada.nextInt(); 
		
		while(sumausuario==numRandom1+numRandom2){
			
			System.out.println("Debes introducir la suma de dos números aleatorios");
			numRandom1 = random.nextInt(100); 
			System.out.println("El primer número es " + numRandom1);
		 numRandom2 = random.nextInt(100); 
			System.out.println("El segundo número es " + numRandom2);
			System.out.println("Dime la suma: ");
			sumausuario= entrada.nextInt(); 
			
		}
		
		System.out.println("La suma es incorrecta");
		
		}
}