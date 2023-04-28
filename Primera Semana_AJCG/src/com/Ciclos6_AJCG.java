package com;

public class Ciclos6_AJCG {

	public static void main(String[] args) {
		//Primero mostrar la cantidad 
		System.out.println("Se desean invertir $1,000 en un banco");
		double cantidad=1000;
		int x=1;
		while (x<12) { 
			cantidad=(cantidad*0.02)+cantidad;
			x++;
			if (x==12) {
				System.out.println("El total es ");
				System.out.printf("%.2f", cantidad);
			}
		}

			

					
		}
			
	}
			


		
		
		




