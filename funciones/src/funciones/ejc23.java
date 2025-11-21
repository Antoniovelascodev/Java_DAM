package funciones;
import java.util.Scanner;
public class ejc23 {

		/*Cree una función WriteRectangle para mostrar un rectángulo (relleno) en la pantalla, con el ancho y el alto indicados como parámetros, 
	 	utilizando asteriscos. Complete el programa de prueba con una función principal:
	 
		WriteRectangle(4,3);
		debe mostrarse
		****
		****
		****
		*/
	
	public static void WriteRectangle(int ancho, int largo) {
		
		for (int i = 0; ancho>i; i++) {
			for(int b = 0; largo>b ; b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dime el largo: ");
		int a = entrada.nextInt(); 
		System.out.println("Dime el ancho: ");
		int c = entrada.nextInt(); 
		
		WriteRectangle(a,c); 
		
	}

}
