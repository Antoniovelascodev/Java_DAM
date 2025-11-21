package funciones;
import java.util.Scanner;
public class FactorialFuncionRecursiva {

	public long factorialrecursiva(long n){
													//PARA FUNCIONES RECURSIVAS ES MEJOR NO USAR BUCLES SI NO ES EXTRICTAMENTE NECESARIO 
		if ( n == 0 || n == 1) {
			return 1; 								// ESTE ES EL CASO BASE, SIRVE PARA QUE ALGO QUE YA SABEMOS SE USE ANTES DE LA RECURSIVA Y DONDE SE DETIENE <
		}else {
			return n * factorialrecursiva(n -1) ;   // ESTA ES LA RECURSIVA QUE SIRVE PARA SOLUCIONAR EL PROBLEMA 
		}
	}
	
	public int fibonacci (int num ) {
		
		if (num ==1) return 1; 
		if (num==2) return 1;
		return (fibonacci (num-1) + fibonacci (num-2)); 
		
	}

	public int productoIt(int a, int b) {
		
		int producto = 0; 
		for(int i=1; i<=b ; i++) {
			producto +=a; 
		}
		return producto; 
	}
	
	public int producto (int a, int b ) {
		if(b==1)return a;
		return (a+producto(a,b-1)); 
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero y te digo varias :  ");
		int num = entrada.nextInt(); 
		
		FactorialFuncionRecursiva factorial = new FactorialFuncionRecursiva();		//AQUI LLAMAMOS A LA FUNCION PRIMERO DANDOLE EL NUMERO AL FINAL, SE LE PONE NOMBRE A LA CLASE = NEW CLASE
		System.out.println("El factorial de " + num + " es " + factorial.factorialrecursiva(num)); //AQUI CON EL SYSO LE PONEMOS EL VALOR DE LA FUNCION factorialrecursiva Y EN PARENTESIS EL SCANNER 
		System.out.println("El fibonacci de " + num + " es " + factorial.fibonacci(num));
		System.out.println("El productoIt de " + num + " es " + factorial.productoIt(num,num));
		System.out.println("Dame el segundo numero para multiplicarlo por el : ");
		int num2 = entrada.nextInt(); 
		
		System.out.println("El producto de " + num + " es " + factorial.producto(num,num2));
	}
}
