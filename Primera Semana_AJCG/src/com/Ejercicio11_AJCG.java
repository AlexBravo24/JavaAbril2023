package com;

import java.util.Scanner;

public class Ejercicio11_AJCG {

	public static void main(String[] args) {
		System.out.println("Selecciona el numero de tu zona:");
		System.out.println("1.América del Norte");
		System.out.println("2.América Central");
		System.out.println("3.América del sur");
		System.out.println("4.Europa");
		System.out.println("5.Asia");
		Scanner lector= new Scanner (System.in);
		int ubicacion;
		ubicacion=lector.nextInt();
		System.out.println("Ingrese el peso de su paquete");
		Scanner lector2=new Scanner (System.in);
		int peso;
		peso=lector2.nextInt();
		if (peso>5 || peso<0) {
			System.out.println("No puede ser transportado");
		} else {
			switch (ubicacion) {
			
			case 1:
				int precio1=24;
				int resultado=peso*precio1;
				System.out.println("El precio es igual a " + resultado + " euros");
				break;
			case 2:
				int precio2=20;
				int resultado2=peso*precio2;
				System.out.println("El precio es igual a " + resultado2 + " euros");
				break;
			case 3:
				int precio3=21;
				int resultado3=peso*precio3;
				System.out.println("El precio es igual a " + resultado3 + " euros");
				break;
			case 4:
				int precio4=10;
				int resultado4=peso*precio4;
				System.out.println("El precio es igual a " + resultado4 + " euros");
				break;
			case 5:
				int precio5=18;
				int resultado5=peso*precio5;
				System.out.println("El precio es igual a " + resultado5 + " euros");
				break;
			} 
		}


	}//FIN DE MAIN

}//FIN CODIGO
