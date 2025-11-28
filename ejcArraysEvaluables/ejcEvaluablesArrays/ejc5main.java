package ejcEvaluablesArrays;
public class ejc5main {

	public static void main(String[] args) {
        ejc5funcion jc =new ejc5funcion();
        int t[] = {10,1,5,8,9,2};
        int elem=3;
        int total[]=jc.suma(t, elem);
        for(int n:total) {
            System.out.println(n+" ");
        }
	}
}