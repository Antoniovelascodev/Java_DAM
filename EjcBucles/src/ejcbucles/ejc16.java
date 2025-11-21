package ejcbucles;
import java.util.Scanner; 
public class ejc16 {

	public static void main(String[] args) {
		int codigo = 2222;
		int intentos = 4;
		System.out.println("Dime la combinacion, tienes "+ intentos+" intentos");
		Scanner entrada = new Scanner(System.in); 
		int codigointr = entrada.nextInt() ; 
		if(codigointr == codigo) {
			System.out.println("Código válido");
			
		}else while(codigointr != codigo) {
			intentos--;
			System.out.println("Código inválido, quedan "+ intentos + " intentos");
			codigointr = entrada.nextInt() ; 
			if(codigointr == codigo) {
				System.out.println("Código válido");
				break;
			}
			if(intentos==0) {
				System.out.println("Numero máximo de intentos");
			break;
			
		}
	}
	

}
}

