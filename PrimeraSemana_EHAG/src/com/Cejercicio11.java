package com;

import java.util.Scanner;

public class Cejercicio11 {

	public static void main(String[] args) {
		/*13. Una institución benéfica recibe anualmente una donación proveniente 
		 * de Europa y lo reparte entre un 
centro de salud, un comedor de niños y una parte lo invierte en la bolsa
 de acuerdo a lo siguiente:
Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
y el resto se invierte en la bolsa.
Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
niños y el resto se invierte en la bolsa.
La institución desea saber cuánto de dinero destinará a cada rubro anualmente*/
Scanner institucion = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la donación anual: $");
        double montoDonacion =institucion.nextDouble();
        
        double centroSalud, comedorNinos, bolsa;
        if (montoDonacion >= 10000) {
            centroSalud = montoDonacion * 0.3;
            comedorNinos = montoDonacion * 0.5;
            bolsa = montoDonacion * 0.2;
        } else {
            centroSalud = montoDonacion * 0.25;
            comedorNinos = montoDonacion * 0.6;
            bolsa = montoDonacion * 0.15;
        }
        
        System.out.println("Se destinarán los siguientes montos:");
        System.out.println("- Centro de salud: $" + centroSalud);
        System.out.println("- Comedor de niños: $" + comedorNinos);
        System.out.println("- Bolsa: $" + bolsa);

	}

}
