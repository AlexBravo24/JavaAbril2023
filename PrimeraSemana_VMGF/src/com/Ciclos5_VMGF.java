package com;

public class Ciclos5_VMGF {

	public static void main(String[] args) throws InterruptedException {
		// reloj
		
		for (int hora = 0;hora <= 23; hora++) 
			for (int minuto = 0;minuto < 60; minuto++) 
				for (int segundo = 0;segundo < 60; segundo++) {
					System.out.printf("%02d:%02d:%02d:\n", hora, minuto, segundo);
					Thread.sleep(1000);// para esperar 1 seg
				}
		
	}

}
