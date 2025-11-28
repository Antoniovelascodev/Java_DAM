package ejcEvaluablesArrays;
import java.util.Scanner;
public class ejc4Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		ejc4 jc = new ejc4(); 
		
		boolean t [][] = new boolean [3][3]; 
		// 	       x y 
		
		//   y 
		// x T F F 
		//   T T F 
		//	 T T T
		
		
		//empiezo en 0,0 
		t [0][0] = true; 
		t [0][1] = true; 
		t [0][2] = true; 
		t [1][0] = false; 
		t [2][0] = false; 
		t [1][1] = true; 
		t [2][1] = false; 
		t [2][2] = true; 
		t [1][2] = true; 
	
		System.out.println("El mapa es de 3 de ancho por 3 de largo, deberás introducir numeros ( 0, 1 o 2)");
		System.out.println();
		System.out.println("Estás en [0,0], ¿A dónde quieres ir?");
		System.out.print("X: " );
		int x = entrada.nextInt(); 
		while (true) {
			if (x >2 || x<0 ) {
				System.out.println("Debes introducir del 0-2: ");
				x = entrada.nextInt();
			}else { break;}
		}
		System.out.print("Y: ");
		int y = entrada.nextInt(); 	
		while (true) {
			if (y >2 || y<0 ) {
				System.out.println("Debes introducir del 0-2: ");
				y = entrada.nextInt();
			}else { break;}	
		}
		if (x == 0 && y == 0) {
			System.out.println("Yá estás aquí, reinicia.");
		}
		System.out.println();
		System.out.println("¿Se puede mover?: " + jc.puedeMover(t, x, y));
		if ( jc.puedeMover(t, x, y) == false) {
			System.out.println("Te has topado con una pared, reinicia.");
		}
		entrada.close();
	}
}	