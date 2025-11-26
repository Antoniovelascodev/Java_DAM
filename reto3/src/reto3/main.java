package reto3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		funciones jc = new funciones (); 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Dime la clave: ");
		int clave = entrada.nextInt() ; 
		
		char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		char [] abecedarioMay = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char [] numeros = {'0','1','2','3','4','5','6','7','8','9'}; 
		
		System.out.println("Dime una palabra (Puede ser mayusuclas minusculas y numeros ): ");
		String texto = entrada.next();
		
		String textoCambiado = jc.SaberQueEsTexto(clave, abecedario, abecedarioMay, numeros, texto); 
		System.out.println("El texto cambiado con la clavee es : " + textoCambiado);
		
	}

}