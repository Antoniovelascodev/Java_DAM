package ejcbucles;
import java.util.Scanner; 
public class ejc3Evaluable {

	public static void main(String[] args) {

	/*Para dos números dados, a y b, es posible buscar el máximo común divisor 
	 * (el número más grande que divide a ambos) mediante un algoritmo 
	 * ineficiente pero sencillo: desde el menor de a y b, ir buscando, 
	 * de forma decreciente, el primer número que divide a ambos simultáneamente. 
	 * Realiza un programa que calcule el máximo común divisor de dos números.
	 */
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dame dos números y te calculo el maximo común divisor  ");
		System.out.println("Dame el primer número: ");
		int a = entrada.nextInt();
		System.out.println("Dame el segundo número: ");
		int b = entrada.nextInt(); 
		int max=Math.max(a, b);
		int mcd= 1;
		boolean mcdEncontrado=false; 
		for(int i=max; i>=1 && !mcdEncontrado ; i-- ) {
			if( (a%i==0) && (b%i==0) ) {
				mcd=i;
				mcdEncontrado=true; 
			}
		}
		System.out.println("El mcd de "+ a +" y " + b + ", es: " + mcd);
	}
}
