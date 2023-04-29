package com;

import java.util.Scanner;

public class Ejercicio6_JIMU {

	public static void main(String[] args) {
		/*6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
tamaño 2.
Precio inicial se recibe desde teclado*/
		
		int tipoUva;
		int tamañoUva;
		double precioInicial;
		double precioPago;
		
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Determine el tipo de la Uva");
		System.out.println("Escriba 1 si es Tipo A");
		System.out.println("Escriba 2 si es Tipo B");
		tipoUva = entrada.nextInt();

		
		System.out.println("Diga si la Uva es tamaño 1 o 2");
		tamañoUva = entrada.nextInt();

		
		System.out.println("Introduce el precio inicial");
		precioInicial = entrada.nextInt();
		
		if (tipoUva ==1 && tamañoUva==1) {
			precioPago=precioInicial+0.2;
			System.out.println("Su pago será "+precioPago);

			
		}else if (tipoUva ==1 && tamañoUva==2) {
		precioPago=precioInicial+0.3;
		System.out.println("Su pago será "+precioPago);

		
	
	} else if (tipoUva ==2 && tamañoUva==1) {
	   precioPago=precioInicial-0.3;
		System.out.println("Su pago será "+precioPago);

	   
	}else if (tipoUva ==2 && tamañoUva==2) {
		   precioPago=precioInicial-0.5;
			System.out.println("Su pago será "+precioPago);

}
}
}
