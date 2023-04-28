package com;

import java.util.Scanner;

public class Ejercicio6_DCC {
	public static void main(String[] args) {
		/*--La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
		es de tama�o 2.
		Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
		tama�o 2.
		Precio inicial se recibe desde teclado--*/
		
		int precioInicial;
		String tama�o1;
		String tipo1;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el valor inicial de la uva en centimos");
		precioInicial = lector.nextInt();
		
		System.out.println("Escoge entre el tipo A y B");
		tipo1 = lector.next();
		
		System.out.println("Escoge entre tama�o 1 y 2");
		tama�o1 = lector.next();
		
		if (tipo1.equals("A")) {
			if(tama�o1.equals("1")) {
				precioInicial = precioInicial + 20;
			} else if (tama�o1.equals("2")) {
				precioInicial = precioInicial + 30;
			}
		} else if(tipo1.equals("B")) {
			if(tama�o1.equals("1")) {
				precioInicial = precioInicial - 30;
			} else if (tama�o1.equals("2")) {
				precioInicial = precioInicial - 50;
			}
		}
		
		System.out.println("El valor inicial de la uva en centimos es: " + precioInicial);
	}
}
