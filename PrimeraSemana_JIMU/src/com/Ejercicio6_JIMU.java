package com;

import java.util.Scanner;

public class Ejercicio6_JIMU {

	public static void main(String[] args) {
		/*6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
es de tama�o 2.
* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
tama�o 2.
Precio inicial se recibe desde teclado*/
		
		int tipoUva;
		int tama�oUva;
		double precioInicial;
		double precioPago;
		
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Determine el tipo de la Uva");
		System.out.println("Escriba 1 si es Tipo A");
		System.out.println("Escriba 2 si es Tipo B");
		tipoUva = entrada.nextInt();

		
		System.out.println("Diga si la Uva es tama�o 1 o 2");
		tama�oUva = entrada.nextInt();

		
		System.out.println("Introduce el precio inicial");
		precioInicial = entrada.nextInt();
		
		if (tipoUva ==1 && tama�oUva==1) {
			precioPago=precioInicial+0.2;
			System.out.println("Su pago ser� "+precioPago);

			
		}else if (tipoUva ==1 && tama�oUva==2) {
		precioPago=precioInicial+0.3;
		System.out.println("Su pago ser� "+precioPago);

		
	
	} else if (tipoUva ==2 && tama�oUva==1) {
	   precioPago=precioInicial-0.3;
		System.out.println("Su pago ser� "+precioPago);

	   
	}else if (tipoUva ==2 && tama�oUva==2) {
		   precioPago=precioInicial-0.5;
			System.out.println("Su pago ser� "+precioPago);

}
}
}
