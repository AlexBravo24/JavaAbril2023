package com;

public class Ciclos5_JIMU {

	public static void main(String[] args) {
		/*
		 * 5. Simular el comportamiento de un reloj digital, 
		 * imprimiendo la hora, minutos y segundos 
			de un d�a desde las 00:00:00 horas 
			hasta las 23:59:59 horas
		 */

		for(int i=0;i<24;i++) {
			for(int j=0;j<60;j++) {
				for(int k=0;k<60;k++) {
					
					System.out.println(String.format("%02d",i)+":"+String.format("%02d",j)
					+":"+String.format("%02d",k));
					//Thread.sleep(1000);
						
				}
				
			}
			
		}

	}

}
