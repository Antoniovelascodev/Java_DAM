package ejcEvaluablesArrays;

import java.util.Arrays;

public class ejc1Main {

	
	public static void main(String[] args) {
	
		int t[] = {2,3,4,5,1,1,2,2}; 
		int clave = 2; 
		
		ejc1Funcion jc = new ejc1Funcion(); 
		int resultado [] = jc.buscarTodos(t, clave); 
		
		
		// el Arrays.toString imprime los resultados del array. 
		System.out.println("Los indices de la clave son : " + Arrays.toString(resultado) );
		
	}

}
