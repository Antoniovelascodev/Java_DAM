package sumafac;
import java.util.Scanner; 
public class SumaFactorial {


	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		System.out.println("Dame el número N para calcular los factoriales");
		int n =entrada.nextInt(); 
		System.out.println(" ");
		double suma = 0; 
		int factorial = 1; 
		//Variables 
			for (int i = 0 ; i <= n ; i++ ) { //bucle calcular de 0 a n e incrementamos la variable con i++
			if (i > 0) {			// Calculo factorial 
				factorial*=i; 
			}
			for (int j=2; j<=1 ; j++) {
				factorial*=j; 
			}
			System.out.println( i+"!= "+ factorial );
			suma += factorial; 
		
		}
		System.out.println(" ");
		System.out.println("Suma de los factoriales es = " + suma );
		entrada.close();
	
	}
}

