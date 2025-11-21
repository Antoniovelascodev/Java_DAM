package ejcArraysEvaluables;
import java.util.Arrays;
public class ejc2 {
	
/*
 El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo 
de los habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. 
Para finalizar la entrada de datos, introduce un sueldo con valor - 1.

Una vez terminada la entrada de datos, muestra la siguiente información:

-Todos los sueldos introducidos ordenados de forma decreciente.
-El sueldo máximo y mínimo.
-La media de los sueldos.
 
 */
	
	public double [] salariosEmpresaAumentar(double [] salarios){
		
		double nuevoSalarios[]= new double[salarios.length+5]; 
		for (int i = 0; i<=salarios.length-1; i++) {
			nuevoSalarios[i]=salarios[i]; 
		}
		return nuevoSalarios; 
	}
	
	
	public void mostrarSalarios (double [] salarios) {
		for (double s: salarios)
			System.out.println(s);
		System.out.println("**********");
	}
	
	
	public double mediaSalarios (double [] salarios, int j) {
		
		double total = 0; 
		for ( double s :salarios) {
			total +=s; 
		}
		return total/j; 	
	}
	
	
	public double maximo (double [] salarios) {
		
		double max = 0; 
		for (double s: salarios) {
			if(s>max) {
				max =s; 
			}
		}
		return max; 
	
	}
	
	
	public double minimo (double [] salarios, int numeroSala) {
		double min = 0;
		for(int i=0; i<numeroSala ; i++) {
			if(salarios[i]<min) {
				min = salarios [i]; 
			}
		}
		return min; 
	}
	
	
	public void ordenarCreciente ( double [] salarios) {
		Arrays.sort(salarios);
	}
	
	
}