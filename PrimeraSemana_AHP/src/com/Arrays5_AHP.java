package com;

public class Arrays5_AHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista[] = { "Leche", "Cereal", "Carne", "Pescado", "Sandía" };
		double[] precios = { 16, 50, 100, 80, 50 };

		System.out.println("Lista de Productos: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i] + ": " + "$" + precios[i]);

		}

	}

}
