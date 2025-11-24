package reto2;
import java.util.Arrays;

public class retoFunciones {

	public double hijo (double padre , double madre ) {
		double hijo = ((padre + madre)/2)+6.5; 
		return hijo;
	}
	public double hija (double padre , double madre ) {
		double hija = ((padre + madre)/2)-6.5; 
		return hija;
	}
	
	public double []alturaFamilia (double hija, double hijo , double padre , double madre) {
		double [] alturaFamilia = {hija, hijo, padre, madre}; 
		return alturaFamilia; 
	}
	
	public double []eliminarAltura ( double [] alturaFamilia, double eliminar){
		int indice = -1; 
		for (int i = 0; i<alturaFamilia.length ; i++) { // Para saber el indice de la altura que se desea eliminar 
			if (alturaFamilia[i] == eliminar) {
				indice = i; 
				break; 
			}
		}
		
		if (indice == -1) { //si no encuentra ninguna altura devuelve el original 
			return alturaFamilia; 
		}
		
		double alturaFamiliaNew [] = new double [alturaFamilia.length-1]; 
		int m = 0; 
		int j = 0; 
		
		while (m < alturaFamilia.length) {
		      if (m != indice) {
		           alturaFamiliaNew[j] = alturaFamilia[m];
		           j++;
		       }
		       m++;
		}
		return alturaFamiliaNew; 
	}
	
	
	public double media ( double alturaFamiliaNew []) {
		double suma = 0; 
		for ( int i = 0; i<alturaFamiliaNew.length ; i++) {
			suma += alturaFamiliaNew[i]; 
		}
		double media = suma / alturaFamiliaNew.length ; 
		return media;  
	}
	
	public double[] alturaFamiliaNew2(double[] alturaFamiliaNew, double estaturaNew) {

	    // Copiar el array y aumentar su tamaño en +1 para meter otro valor al final 
	    double[] alturaFamiliaNew2 = Arrays.copyOf(alturaFamiliaNew, alturaFamiliaNew.length + 1);
	    // le pongo la estatura al final, con el copy of copia todo el array más facilmente que un bucle 
	    alturaFamiliaNew2[alturaFamiliaNew.length] = estaturaNew;

	    return alturaFamiliaNew2;
	}
	
	public double mediaNew ( double [] alturaFamiliaNew2 ) {
		double sumaNew = 0; 
		for ( int i = 0; i<alturaFamiliaNew2.length ; i++) {
			sumaNew += alturaFamiliaNew2[i]; 
		}
		double mediaNew = sumaNew / alturaFamiliaNew2.length ; 
		return mediaNew;  
	}
	
	
	public double [] arrayOrdenado ( double [] alturaFamiliaNew2) {
		
		Arrays.sort(alturaFamiliaNew2);
		return alturaFamiliaNew2;
		
	}
	
	public double [] estaturasMenores150 (double [] alturaFamiliaNew2) {
		
		double bajitos [] = new double [alturaFamiliaNew2.length]; 
		
		int menos150 = 0; 
		for ( double t : alturaFamiliaNew2) {
			if (t <= 150) {
				bajitos[menos150] = t; 
				menos150++; // consigo el numero de bajitos de 150
			}
		}
		
		return bajitos; 
	}
	
	
}