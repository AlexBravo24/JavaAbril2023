package com;

import java.util.Scanner;

public class Ejercicio6_JCGM {

	public static void main(String[] args) {
		
//		 La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
//		 clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
//		 es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
//		 entrega en un embarque considerando lo siguiente:
//		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
//		 es de tama�o 2.
//		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
//		 tama�o 2.
		
        Scanner leer = new Scanner(System.in);

        double precioInicial;
        int tipo, tama�o;

        
        System.out.print("Ingrese precio inicial de la uva: ");
        precioInicial = leer.nextDouble();

      
        System.out.print("Ingrese tipo de uva (A=1, B=2): ");
        tipo = leer.nextInt();
        
        if (tipo >=3) {
        	System.out.println("Entrada invalida");
        	System.exit(0);
        }
      
        System.out.print("Ingrese tama�o de la uva (1=peque�o, 2=grande): ");
        tama�o = leer.nextInt();
        
        if (tama�o >=3) {
        	System.out.println("Entrada invalida");
        	System.exit(0);
        }


        
        double precioVenta = precioInicial;
        if (tipo == 1) {
            if (tama�o == 1) {
                precioVenta += 0.2;
            } else if (tama�o == 2) {
                precioVenta += 0.3;
            }
        } else if (tipo == 2) {
            if (tama�o == 1) {
                precioVenta -= 0.3;
            } else if (tama�o == 2) {
                precioVenta -= 0.5;
            }
        }
        
        
        System.out.println("El precio de venta de la uva es: " + precioVenta);

      
    }
}
