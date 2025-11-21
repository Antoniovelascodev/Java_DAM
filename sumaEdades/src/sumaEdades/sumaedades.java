package sumaEdades;
import java.util.Scanner; 
public class sumaedades {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in); 
	
			double sumaEdades = 0; 
			double edad = 0; 
			double mediaEdades = 0;
			double NumEdades = 0; 
			System.out.println("Introduce la edad");
 			edad=entrada.nextInt(); 
			for(;edad>=0;) {
 				sumaEdades+=edad;
 				NumEdades++;
 				System.out.println("Introduce la edad");
 				edad = entrada.nextInt();   
 				} 
 				if(NumEdades <=0) {
 					System.out.println("No se puede, pon un número positivo.");
 				}else {
 				mediaEdades = sumaEdades/NumEdades;
 				System.out.println("La media de edades = " + mediaEdades);
				}
			}
}
			
			
		
		


//realiza un programa en java que calcule la media de una serie de edades. 
//El proceso finaliza cuando se ponga un número negativo. 
