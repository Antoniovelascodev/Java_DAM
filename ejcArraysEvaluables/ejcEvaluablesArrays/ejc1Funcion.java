package ejcEvaluablesArrays;
public class ejc1Funcion {
	
	public int [] buscarTodos ( int t[], int clave) { 
		
		// Le ponemos el contador para saber cuantas claves tenemos
		int contador = 0; 
		
		// For each para que recorra todo el array de t 	
		for(int numero : t){			 
			
			//si en el array de t hay ints con valor clave el contador se suma 1
			if(numero == clave) {
				contador++;
			}
		}
		
		// Si el contador es 0 significa que no hay claves y ahi returneamos que su valor que no hay 
		if ( contador == 0) {
			return null; 
		}
		
		// Hacemos un array para buscar el indice con el contador de claves que tenemos ( lo que he hecho antes ) 
		int [] buscarIndice = new int [contador]; 
		
		// Inicializamos una variable para que se guarden aqui los indices del array que tengan la clave
		int j = 0; 
		
		//Recorre t y busca la clave, cuando la encuentra se recoge el i en el array creado antes y la variable dentro 
		for ( int i = 0; i<t.length; i++) {
			if ( t[i] == clave) {
				buscarIndice[j] = i ;
				j++; 
			}
			
		}
		return buscarIndice; 
	}
}