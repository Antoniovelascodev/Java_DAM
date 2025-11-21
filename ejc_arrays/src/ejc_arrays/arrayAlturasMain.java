package ejc_arrays;

public class arrayAlturasMain {

	    public static void main(String[] args) {
	        float alturas []=new float [3];
	        alturas [0]=1.78f;
	        alturas [1]=1.48f;
	        alturas [2]=1.67f;
	        for (int i=0;i<=alturas.length-1;i++) {
	            System.out.println(alturas[i]);
	        }
	        System.out.println("**");
	        float alturas2[]= {1.34f,1.64f,1.56f,1.75f};
	        for (int i=0; i<=alturas2.length-1;i++) {
	            System.out.println(alturas2[i]);
	        }
	        System.out.println("**");
	        //foreach
	        for(float altura:alturas2) {
	            System.out.println(altura);
	        }
	        System.out.println("**");
	        float sumaAltura=0;
	        for(int i=0;i<=alturas2.length-1;i++) {
	            sumaAltura+=alturas2[i];
	        }
	        System.out.println(sumaAltura);
	        System.out.println(sumaAltura/alturas2.length-1);
	        System.out.println("**");
	        sumaAltura=0;
	        for (float altura:alturas2) {
	            sumaAltura+=altura;
	        }
	        System.out.println(sumaAltura);
	        System.out.println(sumaAltura/alturas2.length);
	        System.out.println("**");
	        arrayAlturasFunciones af=new arrayAlturasFunciones();
	        af.mostraralturas(alturas2);
	        System.out.println("**");
	        af.mostraralturas(alturas);
	        System.out.println("**");
	        System.out.println(af.sumaarrays(alturas2));
	        System.out.println("**");
	        System.out.println(af.encontrarAltura(alturas2,1.64f));
	    }
	}