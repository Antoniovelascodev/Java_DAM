package ejcArraysEvaluables;
public class ejc1 {
/*
Realiza la función: int [] buscarTodos (int t[], int clave), que crea y devuelve una
tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. En el caso de que la clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
 */

	// entrada {1 4 3 5 3} ,  3
	// salida {2,4} 
	
	public int [] buscarTodos ( int t[], int clave ) {
		
		int contador = 0; 
		
		for(int num:t) {
			if(num==clave)contador++; 
		}
		if (contador==0)return null; 
		int arrayIndices[] = new int [contador];  
		int j = 0; 
		
		for(int i = 0; i<=t.length-1; i++) {
			
			if(t[i] == clave) {
				arrayIndices[j] = i ; 
				j++;
			}	
		
		}
		
	return arrayIndices; 
	
	}

}