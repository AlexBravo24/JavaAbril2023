package com;

public class Arrays5_AJCG {

	public static void main(String[] args) {
		String [] productos= {"Calabaza", "Zanahoria", "Erizo", "Champiñon","Chile"};
		double [] precios= {15, 8, 12.50, 10, 5.5};
		for (int i=0; i<productos.length;i++) {
			System.out.println(productos[i]+" $"+precios[i]);
		}

	}

}
