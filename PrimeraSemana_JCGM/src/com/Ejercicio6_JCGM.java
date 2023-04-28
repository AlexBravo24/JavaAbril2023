package com;

import java.util.Scanner;

public class Ejercicio6_JCGM {

	public static void main(String[] args) {
		
//		 La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
//		 clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
//		 es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
//		 entrega en un embarque considerando lo siguiente:
//		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
//		 es de tamaño 2.
//		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
//		 tamaño 2.
		
        Scanner leer = new Scanner(System.in);

        double precioInicial;
        int tipo, tamaño;

        
        System.out.print("Ingrese precio inicial de la uva: ");
        precioInicial = leer.nextDouble();

      
        System.out.print("Ingrese tipo de uva (A=1, B=2): ");
        tipo = leer.nextInt();
        
        if (tipo >=3) {
        	System.out.println("Entrada invalida");
        	System.exit(0);
        }
      
        System.out.print("Ingrese tamaño de la uva (1=pequeño, 2=grande): ");
        tamaño = leer.nextInt();
        
        if (tamaño >=3) {
        	System.out.println("Entrada invalida");
        	System.exit(0);
        }


        
        double precioVenta = precioInicial;
        if (tipo == 1) {
            if (tamaño == 1) {
                precioVenta += 0.2;
            } else if (tamaño == 2) {
                precioVenta += 0.3;
            }
        } else if (tipo == 2) {
            if (tamaño == 1) {
                precioVenta -= 0.3;
            } else if (tamaño == 2) {
                precioVenta -= 0.5;
            }
        }
        
        
        System.out.println("El precio de venta de la uva es: " + precioVenta);

      
    }
}
