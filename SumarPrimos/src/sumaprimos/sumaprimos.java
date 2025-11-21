package sumaprimos;
import java.util.Scanner; 
public class sumaprimos {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dame un número y te digo calculo la suma de primos ");
		int n = entrada.nextInt(); 
		
		int sumaPrimo =0; 
		for (int i=1; i<=n; i++){
			boolean primo=true;
			for (int j=2; (j<=i-1) &&primo ; j++) {
				if (i%j==0) {
					primo=false; 
				}
			}
			if (primo==true) sumaPrimo+=i;
		}
		
		System.out.println(sumaPrimo);
		
	}
	}





