package funciones;

import java.util.Scanner;

public class mainejc7 {

	public static void main(String[] args) {
		
	ejc7 areas = new ejc7();
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Dime el área del circulo: ");
	double aci = entrada.nextDouble(); 
	System.out.println(areas.circulo(aci));
	
	System.out.println("Dime el área del cuadrado: ");
	double acu = entrada.nextDouble(); 
	System.out.println(areas.cuadrado(acu));
	
	System.out.println("Dime la base del triángulo: ");
	double atr1 = entrada.nextDouble(); 
	System.out.println("Dime la altura del triángulo: ");;
	double atr2 = entrada.nextDouble(); 
	System.out.println(areas.triangulo(atr1,atr2));
	
	}
}
