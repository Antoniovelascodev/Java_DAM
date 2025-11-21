package funciones;

	public class variosSaludos {

	public static void variosSaludos(int numVeces, String misaludo) {
		
		for (int i=1; i<=numVeces;i++) {
			System.out.println(misaludo);
		}

	}
	
	public static void main(String[] args) {

		variosSaludos(3, "otro saludo" );
		variosSaludos(4, "bienvenido"); 
		
	}		
}


