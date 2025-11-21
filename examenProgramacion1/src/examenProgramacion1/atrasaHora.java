package examenProgramacion1;
import java.util.Scanner;
public class atrasaHora {

	public atrasaHora () {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime la hora actual: ");
		int horas = entrada.nextInt(); 
		System.out.println("Dime los minutos: ");
		int minutos = entrada.nextInt(); 
		System.out.println("Dime los segundos: ");
		int segundos = entrada.nextInt(); 
		
		int minutosmenos=0; 
		int horasmenos = 0; 
		
		System.out.println("Has puesto " + horas + "h " + minutos + "min " + segundos+ "s");
		
		System.out.println("Dime cuantos segundos le quieres quitar: ");
		int segundosquitar = entrada.nextInt(); 
	
		int segundostot = segundos+segundosquitar; 		
		
		if (segundostot<=60 ) {
			segundostot = segundos-segundosquitar; 
			if(segundostot<=0) {
				minutosmenos++;
				segundostot = segundostot+60; 
			}
		}else {
			while(segundostot>=60) {
				minutosmenos++;
				segundostot = segundostot-60; 
			}
		}
		int minutostot = minutos - minutosmenos; 
		
		if (minutostot<=60 ) {
			 minutostot= minutos -minutosmenos; 
			 if(minutostot<=0) {
					horasmenos++;
					minutostot = minutostot+60; 
				}
		}else {
			while(minutostot>=60) {
				horasmenos++;
				minutostot = minutostot-60; 
			}
		
		}
		
		int horastot = horas - horasmenos; 
		
		System.out.println("_________");
		System.out.println("");
		System.out.println("Quitando los segundos quedan "+ horastot + "h " + minutostot + "min " + segundostot + "seg ");
		System.out.println("_______________");
		
		if (horastot > 0 || minutostot >0 || segundostot > 0) {
		
			horastot = horastot * 3600; 
			minutostot = minutostot * 60; 
			
			int segundosquequedan = horastot + minutostot + segundostot; 
			
			System.out.println("Han pasado "+segundosquequedan + "segundos desde las 12 de la noche");
			
		}else {
			System.out.println("Son las 12 de la noche");
		}
	}
}