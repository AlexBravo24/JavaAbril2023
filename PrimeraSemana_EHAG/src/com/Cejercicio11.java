package com;

import java.util.Scanner;

public class Cejercicio11 {

	public static void main(String[] args) {
		/*13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente 
		 * de Europa y lo reparte entre un 
centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa
 de acuerdo a lo siguiente:
Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
y el resto se invierte en la bolsa.
Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
ni�os y el resto se invierte en la bolsa.
La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente*/
Scanner institucion = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la donaci�n anual: $");
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
        
        System.out.println("Se destinar�n los siguientes montos:");
        System.out.println("- Centro de salud: $" + centroSalud);
        System.out.println("- Comedor de ni�os: $" + comedorNinos);
        System.out.println("- Bolsa: $" + bolsa);

	}

}
