package com;

public class Arrays5_EHAG {

	public static void main(String[] args) {
	
			    // productos y sus precios
			    String[] productos = {"Mango", "Pera", "Piña", "Fresa", "Durazno"};
			    double[] precios = {29, 20.5, 30, 25, 38};
			    
			   // mostrar productoa y precios
			    System.out.println("Lista de productos:");
			    for (int i = 0; i < productos.length; i++) {
			      System.out.println(productos[i] + ": " + " $" + precios[i] );
			    }
			  }
			


	}


