package ejcbucles;
import java.util.Scanner;
public class ejc1Evaluable {

	public static void main(String[] args) {
		
		//decimal a binario 
		Scanner entrada = new Scanner (System.in); 
		System.out.println("Dime un número y te digo su binario: ");
		int num = entrada.nextInt(); 
		double binario = 0; 
		int exp=0;
		while(num>0) {
			int resto = num%2; 
			num=num/2; 
			binario=resto*Math.pow(10, exp)+binario; 
			exp++;
		}
		System.out.println("");
		System.out.println((int)binario);
			}
	}

