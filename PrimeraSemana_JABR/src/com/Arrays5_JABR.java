package com;

public class Arrays5_JABR {

	public static void main(String[] args) {

		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 * 
		 */

		String productos[] = { "Lapiz", "Plumon", "Lapicero", "Libreta", "Calculadora" };
		double precios[] = { 35.5, 89.60, 45.99, 25.70, 49.90 };
		System.out.println("Lista de Productos y sus precios");
		
//		for (int i = 0; i < productos.length; i++) {
//			System.out.println(productos[i] + " " + precios[i]);
//		}
		
		int x=0; //Declaro una variable iniciada en 0
		//que me ayudará a recorrer mi array, porque las posiciones del array inician en
		//0
		
		while(x<5) {
			System.out.println(productos[x] + " " + precios[x]);
			x++;
		}
		
		
	}

}
