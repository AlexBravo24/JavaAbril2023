package com;

public class Ciclos5_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
			de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		 */
	
		
		for(int horas=0;horas<=23;horas++) {
			for(int minutos=0;minutos<=59;minutos++) {
				for(int segundos=0;segundos<=59;segundos++) {
				System.out.println(horas+":"+minutos+":"+segundos);	
				
				}
			}
		}

	}

}
