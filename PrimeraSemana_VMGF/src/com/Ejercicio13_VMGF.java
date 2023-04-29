package com;

import java.util.Scanner;

public class Ejercicio13_VMGF {

	public static void main(String[] args) {
		// donación
		
double monto, centro, comedor, bolsa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese la cantidad de la donacion ");
		monto = sc.nextDouble();
		
		if(monto>=10000) {
			centro = monto*0.30;
			comedor = monto *0.50;
			bolsa= monto-(centro+comedor);
			System.out.println("La cantidad destinada al centro de salud es de "+centro
					+" La cantidad destinada al comedor es de "+comedor
					+" y el restante que es de "+bolsa+" Es para invertir "
					);
		}else if(monto<10000) {
			centro = monto*0.25;
			comedor = monto *0.60;
			bolsa= monto-(centro+comedor);
			System.out.println("La cantidad destinada al centro de salud es de "+centro
					+"\n La cantidad destinada al comedor es de "+comedor
					+" y \n el restante que es de "+bolsa+" Es para invertir "
					);
		}else {
			System.out.println("Error");
		}

	}

}
