package com;

public class Ejercicio5_Ciclos {

	public static void main(String[] args) throws InterruptedException {
		        for (int hora = 0; hora < 24; hora++) {
		            for (int minuto = 0; minuto < 60; minuto++) {
		                for (int segundo = 0; segundo < 60; segundo++) {
		                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
		                    Thread.sleep(1000); // Esperar 1 segundo
		                }
		            }
		        }
		    }

	}


