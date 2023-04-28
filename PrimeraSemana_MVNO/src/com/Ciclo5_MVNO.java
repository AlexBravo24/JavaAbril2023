package com;

public class Ciclo5_MVNO {
	public static void main(String[] args) {
		/* Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
de un día desde las 00:00:00 horas hasta las 23:59:59 horas */
		
		int horas=0,min=0,seg=0;
		 
		for (horas=0; horas < 24; horas++)
	      for(min = 0; min < 60; min++)
		   for(seg = 0; seg < 60; seg++){
			  		
			  		System.out.println(horas + " : " + min + " : " + seg);
			    	
			    }
	        }
	}

