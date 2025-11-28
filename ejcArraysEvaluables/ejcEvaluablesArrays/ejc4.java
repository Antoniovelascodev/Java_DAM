package ejcEvaluablesArrays;
public class ejc4 {

/*
 * En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas representan lugares (lugar 0, lugar 1, lugar 2, etc.)
 *  que estarán conectados. Si desde el lugar X podemos ir hacia el lugar Y, entonces la matriz en la posición [x][y] valdrá cierto; en caso contrario, 
 *  valdrá falso.
 *  Escribe una función que, dada una matriz que representa el mapa y dos lugares, indique si es posible viajar desde el primer lugar al segundo 
 *  (directamente o pasando por lugares intermedios).
 */
	
	public boolean puedeMover ( boolean t[][], int x, int y) {
		
		if ( t [x][y] == true) {
			return true;
		}
		return false; 
	}
}