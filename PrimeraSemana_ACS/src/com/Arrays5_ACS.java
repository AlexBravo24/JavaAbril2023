package com;

public class Arrays5_ACS {

	public static void main(String[] args) {

		// Crea dos arrays, uno para mostrar n productos y otro para
		// mostrar sus respectivos precios. Muestra en consola la
		// lista de productos y sus precios. Por lo menos 5 productos o artículos.

		String utiles[] = { "\nLap", "silla", "mochila", "lapiz", "libreta" };
		double precios[] = { 400, 50, 35, 12, 25};
		
		System.out.print("Lista de Productos y sus precios: ");
		
		for (int u = 0; u < utiles.length; u++) {
			System.out.println(utiles[u] + " " + precios[u]);
		}

	}
}
