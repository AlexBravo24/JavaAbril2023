package com;

public class Ciclo7_MVNO {
	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
dinero?*/
		double ganancia = 700;
		int contador=0;
		
		do {
			ganancia=ganancia+(ganancia*0.02);
			contador++;
			
		}while(ganancia <=1500);
		System.out.println("El numero de meses es: " + contador);
	}

}
