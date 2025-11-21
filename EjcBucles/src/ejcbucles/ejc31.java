package ejcbucles;
//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
// en caso contrario, el programa termina cuando se introduce un espacio.

import java.util.Scanner;

public class ejc31 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime un caracter");
		char caracter  = entrada.next().charAt(0); 
		
		char a = 1; 
		char e = 2; 
		char i = 3; 
		char o = 4; 
		char u = 5; 
		
		if (caracter == 1|| caracter == 2 || caracter == 3 || caracter == 4|| caracter == 5) {
		System.out.println("Es vocal");
		
	}else {
		System.out.println("No es vocal");
	}
	}
	}
