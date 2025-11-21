package funciones;
public class ejc11funcion {
	public int ascensor(int num) {
		
		for(int i = 0; num>=i ; i++) {
			
			if (num>1) {
			System.out.println("Estás en la planta baja");
			}else {
			System.out.println("Has subido al" + i + "piso");
				
			}
		}
		return num; 
	
	}
	
}
