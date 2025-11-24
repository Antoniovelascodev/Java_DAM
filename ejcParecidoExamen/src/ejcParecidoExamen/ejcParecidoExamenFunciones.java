package ejcParecidoExamen;
public class ejcParecidoExamenFunciones {

	public double [] estaturas (double padre , double madre) {
		double Estaturas [] = {padre,madre}; 
			return Estaturas; 
	}
	
	public double estaturaHijo ( double padre , double madre) {
		double hijo = ((padre + madre ) /2 ) + 6.5; 
			return hijo; 
	}
	
	public double estaturaHija ( double padre , double madre) {
		double hija = ((padre +madre)/2) - 6.5; 
			return hija; 
	}
	
	
		
}
	