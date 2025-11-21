package telefonía;
import java.util.Scanner;

	public class Telefonía {
		public static void main(String[] args) {
		
			 Scanner entrada = new Scanner(System.in); // Hacer entrar el Scanner
			
			 System.out.println("¿Cuantos minutos ha estado hablando? :  ");
			 int m = entrada.nextInt(); // ingresar el número
			
			 System.out.println("¿Ha sido en domingo? (True o false) :  ");
			 boolean domingo = entrada.nextBoolean(); //Meter una pregunta de true or false boolean para saber si es domingo
			
			 System.out.println("¿Ha sido por la mañana? (true o false) :  ");
			 boolean mañana = entrada.nextBoolean(); //Otra vex meter una pregunta de true or false para saber si es por la mañana
			
			 double cost = 0; //le pongo 0 para poder iniciarlo en 0 y ir sumandole
			 double tot;
			 double imp = 0; //le pongo 0 para poder iniviar y acumularle
			
			if ( m <= 5) {
				 cost = m*1;
			}else{
				if(m-5 <= 3) {
					cost = 5*1 + (m-5)*0.8;
				}else{
					if( m-8 <= 2) {
						cost = 5*1 + 3*0.8 + (m-8)*0.7;
					}else{
						cost = 5*1 + 3*0.8 + 2*0.7 + (m-10)*0.5;
						}
					}
			}
			if (domingo){
				 imp += (cost *3) /100;  // el += hace que se acumule el imp, es decir si aqui entra un 0.3 ese ya es su valor y solo le acumula
		}else {
			if(mañana){
				  imp += (cost*15) /100;
			}else{
				  imp += (cost*10)/100;
				}
		}
			 tot = cost + imp;
			System.out.println( "Tienes que pagar " + tot + "€.");
			
		}
	}

