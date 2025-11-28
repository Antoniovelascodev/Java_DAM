package ejcEvaluablesArrays;
import java.util.Scanner;
public class ejc3 {

/*
Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo. 
Debes mostraral final la nota media del grupo en cada trimestre y la media del alumno que se encuentra en una posición dada
(que el usuario introduce por teclado). 
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		int notasAlumno1trim [] = new int [6]; //notas del grupo en 1trimestre
		int notasAlumno2trim [] = new int [6]; //notas del grupo en 2trimestre
		int notasAlumno3trim [] = new int [6]; //notas del grupo en 3trimestre 
		
		int acc1trim = 0; //notas acumuladas 1er trim
		int acc2trim = 0; //notas acumuladas 2do trim
		int acc3trim = 0; //notas acumuladas 3er trim 
		
		for (int i = 1; i<=3 ; i++ ) { // for 3 veces por los 3 trimestres
			
			System.out.println("NOTAS DEL " + i + " trimestre: ");
			System.out.println("--------------------------------");

			if ( i == 1 ) {	
				for (int j = 1; j<=5 ; j++) {	//for 5 veces por las 5 personas del grupo en el primer trim 
					System.out.println("Nota del alumno " + j +" : ");
					int nota = entrada.nextInt();
					while (nota<0 || nota>10) {
						nota = 0; 
						System.out.println("No es válido, recuerda del 0-10, introduce la nota del alumno "+j+ " : ");
						nota = entrada.nextInt();
						}
					acc1trim += nota; 
					notasAlumno1trim[j] = nota; //cada alumno j se le asigna su nota 
				}
			}
			
			if (i == 2) {
				for (int k = 1; k<=5 ; k++) {	//for 5 veces por las 5 personas del grupo en el segundo trim 
					System.out.println("Nota del alumno " + k +" : ");
					int nota = entrada.nextInt();
					acc2trim += nota; 
					notasAlumno2trim[k] = nota; 
				}
			}
				
			if (i == 3) {
				for (int p = 1; p<=5 ; p++) {	//for 5 veces por las 5 personas del grupo en el tercer trim 
					System.out.println("Nota del alumno " + p +" : ");
					int nota = entrada.nextInt();
					acc3trim += nota; 
					notasAlumno3trim[p] = nota; 
				}
			}
			System.out.println("");// salto de linea para que no choque 
			
				}
		
		System.out.println("----------------------------------------- \n");
		System.out.println("La media del grupo en el 1er trimestre es de: " + acc1trim/5 + "\n");
		System.out.println("La media del grupo en el 2do trimestre es de: " + acc2trim/5 + "\n");
		System.out.println("La media del grupo en el 3er trimestre es de: " + acc3trim/5 + "\n");
		System.out.println("----------------------------------------- \n");
		System.out.println("Dime de que alumno quieres saber la media: 1-5 ");
		int pickAlumno = entrada.nextInt();
		
		for (int m = 0 ; m<= pickAlumno ; m++) {
			
			if (m ==pickAlumno) {
				int notamediaAlumno = (notasAlumno1trim[m] + notasAlumno2trim[m] + notasAlumno3trim[m])/3 ;  
				System.out.println("La media del alumno " + m + " es de : "+ notamediaAlumno);
			}
			
		}
	}
}