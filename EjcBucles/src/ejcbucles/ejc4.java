package ejcbucles;
import java.util.Scanner;
public class ejc4 {

	public static void main(String[] args) {
		
		/*Ejercicio 4: Un centro de investigación de la flora urbana necesita una aplicación 
		que muestre cuál es el árbol más alto. Para ello se introducirá por teclado la altura 
		( en centímetros) de cada árbol( terminando la introducción de datos cuando se utilice 
		-1 como altura). Los árboles se identifican mediante etiquetas con números únicos correlativos,
		comenzando en 0. Diseñar una aplicación que resuelva el problema planteado.
		*/
		
		Scanner entrada = new Scanner(System.in); 
		
		int maxEtiqueta=0;
		int etiqueta=0;
		double maxAltura=0;
		double altura=0; 
		do {
			System.out.println("Altura Árbol");
			altura=entrada.nextInt(); 
			if(altura>maxAltura) {
				maxAltura=altura; 
				maxEtiqueta=etiqueta;	
			} etiqueta++; 
		}while (altura!=-1); 
		System.out.println("El arbol con etiqueta "+ maxEtiqueta+ " su altura es la máxima con valor de " + maxAltura);	
	}
}