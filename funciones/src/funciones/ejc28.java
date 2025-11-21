package funciones;
import java.util.Scanner;
public class ejc28 {

	//Escribe una función que reciba una nota numérica y devuelva su equivalente en cadena de caracteres.
//Ejemplo: Usuario introduce 5y6 la función devuelve aprobado, 7 y 8 notable , 9, 10 sobreesaliente
	
	public static void notasEvaluacion (int num) { 
		
		boolean aprobado; 
		
		if(num<5 && num>0) {
			
			aprobado = false;
			System.out.println("Tienes un: Suspenso");
			
		}else if (num>=5){
			
			if (num ==5) {
				System.out.println("Tienes un: suficiente");	
			}else if(num == 6) {
				System.out.println("Tienes un: Bien");
			}else if(num==7 || num ==8) {
				System.out.println("Tienes un: Notable");
			}else if(num==9 || num == 10) {
				System.out.println("Tienes un: Sobresaliente");
			}
			
			aprobado = true; 
			
		}else if (num<0 || num>10)
			System.out.println("Nota Errónea");
		return;	
	}

	public static void main(String[] args) {

		System.out.println("Dime una nota y te digo que has sacado:  ");
		Scanner entrada= new Scanner(System.in); 
		int a =entrada.nextInt(); 
		notasEvaluacion(a);
		
		entrada.close(); 
		
	}

}
