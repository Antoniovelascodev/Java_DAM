package apuntes;
import java.util.Arrays; 
import java.util.Scanner; 
public class apuntes {

	public static void main(String[] args) {
	
		//1. Imprimir un array 
		int [] array = {1,2,3}; 
		System.out.println(Arrays.toString(array));
		
		//2. Recorrer con for-each 
		for (int n : array) {
			System.out.println(n); 
		}
		
		//3. Aumentar el tamaño de un array 
		array = Arrays.copyOf(array, array.length + 1);
		
		//4. Añadir un valor al final 
		public int[] añadir(int[] a, int valor) {
			a = Arrays.copyOf(a, a.length + 1); 
			a[a.length - 1] = valor; 
				return a;
		}
		
		//5. Buscar un valor en un array 
		public int buscar(int[] a, int valor) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == valor) {
					return i; 
				}
			} 
			return -1; 
		}
		
		//6. Intercambiar posiciones 
		public void swap(int[] a, int i, int j) {
			int temp = a[i]; 
			a[i] = a[j]; 
			a[j] = temp; 
		}
		
		//7. Subir un elemento una posición 
		public int[] subirUno(int[] a, int i) {
			if (i == 0) return a; 
			swap(a, i, i - 1); 
			return a;
		}
		
		//8. Eliminar un elemento por índice 
		public int[] eliminar(int[] a, int indice) { 
			int[] nuevo = new int[a.length - 1]; 
			for (int i = 0; i < indice; i++) { 
				nuevo[i] = a[i]; 
				} 
			for (int i = indice + 1; i < a.length; i++) {
				nuevo[i - 1] = a[i]; 
			} 
			return nuevo; 
		}
		
		//9. Bajar un elemento al último puesto 
		public int[] bajarAlFinal(int[] a, int i) {
			int valor = a[i]; 
			for (int j = i + 1; j < a.length; j++) { 
				a[j - 1] = a[j]; 
			} 
			a[a.length - 1] = valor;
				return a; 
		}
		
		//10. Leer datos hasta -1 
		Scanner entrada = new Scanner(System.in); 
		int valor = 0; 
		while (valor != -1) { 
			System.out.print("Introduce valor: "); 
			valor = entrada.nextInt(); 
		}
		
	//******INFO EXTRA****** 
	/*  Arrays no crecen solos ---> siempre usar Arrays.copyOf(..,..) 
		
		for-each no da el índice solo leer el valor dentro.(sirve para sumar todos los valores de un array, maximo, minimo, cuantos superan algo..etc)
		
		el for normal SI da el indice y puedes modificar. Necesario para eliminar/bajar/subir...
		
		Mucho cuidado, usar < y no <= 
		
		Si reduces tamaño ---> crear un array nuevo.
		
		No hace falta crear un array nuevo para intercambiar posiciones, subir o bajar uno.
		
		Hace falta array nuevo si quiero eliminar elemento o añadir elemento. 
		
			
		public int buscar(int[] a, int valor)
		public int[] eliminar(int[] a, int indice)
		public int[] añadir(int[] a, int valor)
		public int[] subirUno(int[] a, int indice)
		public int[] bajarAlFinal(int[] a, int indice)
		public void swap(int[] a, int i, int j)
					
		
	*/

	}
