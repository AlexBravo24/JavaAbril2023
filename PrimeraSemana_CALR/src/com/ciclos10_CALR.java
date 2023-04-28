package com;

import java.io.IOException;
import java.util.Scanner;

public class ciclos10_CALR {

	public static void main(String[] args) throws IOException {
		 Scanner escaner = new Scanner(System.in);
	        int numero;
	        char respuesta;
	        int indicePos = 0;
	         int indiceImpar =0;
	         int sumaPositivo;
	         int sumaImpar;
	        

	        do {

	            System.out.print("Introduce un número: ");
	            numero = escaner.nextInt();

	            if (numero != 0) {
	                if (numero > 0) {
	                    System.out.print("Positivo");
	                    
	                } else {
	                    System.out.print("Negativo");
	                }
	                if (numero % 2 == 0) {
	                    System.out.println(" Par");
	                } else {
	                    System.out.println(" Impar");
	                }
	            }

	            System.out.print("Desea introducir más números? (S/N): ");                                  
	            respuesta = (char) System.in.read();

	        } while (respuesta != 'N' && respuesta != 'n');
	}

}
