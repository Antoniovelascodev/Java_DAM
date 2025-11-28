package ejcEvaluablesArrays;
public class ejc5funcion {

	   public int[] suma(int[] t, int elementos) {
	        int total[]=new int[t.length-elementos+1];
	        for (int i=0;i<total.length;i++) {
	            int suma=0;
	            for(int j=i;j<i+elementos;j++) {
	                suma+=t[j];
	            }
	            total[i]=suma;
	        }
	    return total;
	    }
}