package ejcArraysEvaluables;

public class ejc1_main {

	public static void main(String[] args) {
		
		ejc1 arr1 = new ejc1(); 	
			
		int misnumeros[]= {1,4,3,5,3}; 
		int resultado[]=arr1.buscarTodos(misnumeros, 3); 
		for ( int n: resultado) {
			System.out.print(n + " ");
		}
	
	}

}