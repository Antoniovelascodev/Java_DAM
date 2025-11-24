package reto2;

import java.util.Arrays;
import java.util.Scanner;

public class retoMain {

	public static void main(String[] args) {
		retoFunciones jc = new retoFunciones(); 
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Dime la altura del padre: (cm)");
		double padre = entrada.nextDouble(); 
		System.out.println("Dime la altura de la madre: (cm)");
		double madre = entrada.nextDouble(); 
		
		double hijo = jc.hijo(padre, madre); 
		System.out.println("La altura del hijo es: " + hijo);
		
		double hija = jc.hija(padre, madre); 
		System.out.println("La altura de la hija es: " + hija);
		
		double [] alturaFamiliar = jc.alturaFamilia(hija, hijo, padre, madre); 
		System.out.println("El array de la familia es : " + Arrays.toString(alturaFamiliar));
		System.out.println("-----------------------------------");
		
		System.out.println("Dime una estatura para eliminar: ");
		double eliminar = entrada.nextDouble();	
		System.out.println("Has puesto " + eliminar);
		
		double [] alturaFamiliaNew = jc.eliminarAltura(alturaFamiliar, eliminar); 
		System.out.println("El array de familia con esa estatura quitada es : " + Arrays.toString(alturaFamiliaNew));
		System.out.println("-----------------------------------");
		System.out.println("La media de la familia es de " + jc.media(alturaFamiliaNew));
		System.out.println("-----------------------------------");
		System.out.println("Dame otra altura para sustituirla por la anterior quitada: ");
		double estaturaNew = entrada.nextDouble(); 
		
		double [] alturaFamiliaNew2 = jc.alturaFamiliaNew2(alturaFamiliaNew, estaturaNew); 
		System.out.println("El nuevo array es de " + Arrays.toString(alturaFamiliaNew2));
		
		System.out.println("La media es de " + jc.media(alturaFamiliaNew2));
		System.out.println("-----------------------------------");

		System.out.println("El array ordenado es: " + Arrays.toString(jc.arrayOrdenado(alturaFamiliaNew2)));
		System.out.println("-----------------------------------");

		System.out.println("Las estaturas inferiores a 1.50 son: " + Arrays.toString(jc.estaturasMenores150(alturaFamiliaNew2)));
		
	}
	
}