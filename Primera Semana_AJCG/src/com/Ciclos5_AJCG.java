package com;

public class Ciclos5_AJCG {

	public static void main(String[] args) {
		int horas=0, minutos=0, segundos=0;
		int verdad=1;
		while (verdad==1) {
			if (horas<10) {
				System.out.print("0");
			}
			System.out.print(horas+ ":");
			if (minutos<10) {
				System.out.print("0");
			}
			System.out.print(minutos+ ":");
			if (segundos<10) {
				System.out.print("0");
			}
			System.out.println(segundos);
			segundos++;
			if (segundos==60) {
				segundos=0;
				minutos++;
				if (minutos==60) {
					minutos=0;
					horas++;
					if (horas==24) {
						horas=0;
						
					}
				}
			}
			if (horas==23 && minutos==59 && segundos==59) {
				verdad=2;
			}
	
				

			
		}
	}//FIN DE MAIN

}//FIN DE CODIGO
