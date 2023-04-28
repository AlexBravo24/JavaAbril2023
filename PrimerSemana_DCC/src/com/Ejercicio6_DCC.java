package com;

import java.util.Scanner;

public class Ejercicio6_DCC {
	public static void main(String[] args) {
		/*--La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		es de tamaño 2.
		Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
		tamaño 2.
		Precio inicial se recibe desde teclado--*/
		
		int precioInicial;
		String tamaño1;
		String tipo1;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el valor inicial de la uva en centimos");
		precioInicial = lector.nextInt();
		
		System.out.println("Escoge entre el tipo A y B");
		tipo1 = lector.next();
		
		System.out.println("Escoge entre tamaño 1 y 2");
		tamaño1 = lector.next();
		
		if (tipo1.equals("A")) {
			if(tamaño1.equals("1")) {
				precioInicial = precioInicial + 20;
			} else if (tamaño1.equals("2")) {
				precioInicial = precioInicial + 30;
			}
		} else if(tipo1.equals("B")) {
			if(tamaño1.equals("1")) {
				precioInicial = precioInicial - 30;
			} else if (tamaño1.equals("2")) {
				precioInicial = precioInicial - 50;
			}
		}
		
		System.out.println("El valor inicial de la uva en centimos es: " + precioInicial);
	}
}
