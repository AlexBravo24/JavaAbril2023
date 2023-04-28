package com;

public class ciclos5_CALR {

	public static void main(String[] args) {
		for(int hora = 0; hora < 24; hora++) {
			for(int min = 0; min < 60; min++) {
				for(int segundo = 0; segundo < 60; segundo++) {
					System.out.printf("%02d:%02d:%02d\n", hora, min, segundo);
				}
			}
		}

	}

}
