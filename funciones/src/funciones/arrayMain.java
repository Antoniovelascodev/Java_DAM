package funciones;
public class arrayMain {

	public static void main(String[] args) {
		
		float alturas [] = new float[3]; 
		alturas [0] = 1.78f; 
		alturas [1] = 1.48f; 
		alturas [2] = 1.67f; 
		
		for (int i =0; i<=alturas.length-1 ; i++) {
			System.out.println(alturas[i]);
		}
		System.out.println("_______________________");
		float alturas2[]= {1.34f,1.64f,1.56f,1.75f};
		
		for (int i = 0; i <=alturas2.length-1; i++ ) {
			System.out.println(alturas2[i]);
		}
		System.out.println("__________________");
		for (float altura : alturas2) {
			System.out.println(altura);
		}
	}
}