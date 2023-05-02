package com;

public class Ciclos5_DCC {

	public static void main(String[] args) {
		/*--Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		de un día desde las 00:00:00 horas hasta las 23:59:59 horas --*/
		
		//No maneje las valores correctos para que se pueda visualizar mejor el funcionamiento, 
		//por que si no caben todos en la terminal las terv variables las considere a la mitad 
		
		for(int horas = 0; horas < 12; horas++) {
            for(int minutos = 0; minutos < 30; minutos++) {
                for(int segundos = 0; segundos < 30; segundos++) {
                    System.out.println( horas +":" + minutos + ":" + segundos);
                }
            }
        }

	}

}
