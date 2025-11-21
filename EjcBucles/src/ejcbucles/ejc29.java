package ejcbucles;
import java.util.Scanner; 
public class ejc29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dame un numero de altura de L");
		int altura = entrada.nextInt();		
	
		for(int i = 1; i<altura; i++) {
			System.out.println("*");
		}
		int longitud = (altura/2)+1; 
		for(int i =1; i<=longitud;i++) {
			System.out.print("*");
		}
		entrada.close(); 
	} 
}