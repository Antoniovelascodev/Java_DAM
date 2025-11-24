	package ejcParecidoExamen;
	import java.util.Arrays;
	import java.util.Scanner; 
	public class ejcParecidoExamenMain {
	
		public static void main(String[] args) {
			
			ejcParecidoExamenFunciones jc = new ejcParecidoExamenFunciones(); 
			
			Scanner entrada = new Scanner(System.in); 
			System.out.println("Dime la estatura del padre: ");
			double estaturaPadre = entrada.nextDouble(); 
			System.out.println("Dime la estatura de la madre: ");
			double estaturaMadre = entrada.nextDouble(); 
			
			double entradaPadres [] = jc.estaturas(estaturaPadre, estaturaMadre);
			
			System.out.println("La estatura del padre y la madre son de : ");
			System.out.println(Arrays.toString(entradaPadres));
	
			System.out.println("La estatura del hijo es de");
			System.out.println(jc.estaturaHijo(estaturaPadre, estaturaMadre));
			System.out.println("La estatura de la hija es de");
			System.out.println(jc.estaturaHija(estaturaPadre, estaturaMadre));
			
			
		}
	}