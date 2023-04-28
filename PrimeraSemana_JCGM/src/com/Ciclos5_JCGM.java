package com;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Ciclos5_JCGM {

	public static void main(String[] args) {
		
//		 Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
//		 de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    LocalTime tiempo = LocalTime.of(hora, minuto, segundo);
                    System.out.println(tiempo);
                }
            }
        }
		

	}

}
