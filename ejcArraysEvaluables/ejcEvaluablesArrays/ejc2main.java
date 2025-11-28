package ejcEvaluablesArrays;
import java.util.Scanner;
public class ejc2main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ejc2 jc = new ejc2(); 
		double [] missalarios = new double[2];
		double salarioActual=0;
		int j = 0;
		
		while (salarioActual !=-1) {
			System.out.println("Salario?: (pon -1 para terminar)");
			salarioActual = entrada.nextDouble();
			if(salarioActual!=-1) {
				if (j==missalarios.length) {
					missalarios=jc.salariosEmpresaAumentar(missalarios);
				}
				missalarios[j]=salarioActual; 
				j++; 
			}
		}
		System.out.println("La media es de : " + jc.mediaSalarios(missalarios, j));
		System.out.println("El maximo es de : " +jc.maximo(missalarios));
		System.out.println("El minimo es de : " +jc.minimo(missalarios, j));
		jc.ordenarCreciente(missalarios);
		System.out.println("*************");
		System.out.println("Ordenado decrecientemente: ");
		jc.mostrarSalarios(missalarios);
		
		entrada.close();
		
	}

}

