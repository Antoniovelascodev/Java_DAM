package ejcEvaluablesArrays;
	import java.util.Arrays;
	public class ejc2 {

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