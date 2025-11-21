package ejc_arrays;

public class arrayAlturasFunciones {

	  public void mostraralturas(float alturas[]) {
	        for (int i=0; i<=alturas.length-1;i++) {
	            System.out.println(alturas[i]);
	        }
	    }

	    public float sumaarrays(float alturas[]) {
	        float sumaAlturas=0;
	        for (float altura: alturas) {
	            sumaAlturas+=altura;
	        }
	        return (sumaAlturas);
	    }
	    public boolean encontrarAltura(float alturas[], float alturaAbuscar) {
	        for (float altura: alturas) {
	            if (altura==alturaAbuscar) return true;
	        }
	        return false;
	    }
}
