package com;

import java.util.Scanner;

public class Ciclos9_JIMU {

	public static void main(String[] args) {
		/*9. Programa Java que lea dos n�meros y 
		 * muestre los n�meros pares entre ellos 
		 */

Scanner entrada = new Scanner(System.in);
		
		
		int n1, n2;
		
		
		System.out.print("Ingrese el primer numero: ");//se solicita la cadena
		n1= entrada.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");//se solicita la cadena
		n2= entrada.nextInt();
		entrada.close();
		
		if(n1>n2 && n2%2==0) {
			for(int i= n2+2;i<n1;i+=2) {
				System.out.print(i+" ");
			}
		}
		else if(n1>n2 && n2%2!=0) {
			for(int i= n2+1;i<n1;i+=2) {
				System.out.print(i+" ");
			}
		}
		else if(n2>n1 && n1%2!=0) {
			for(int i= n1+1;i<n2;i+=2) {
				System.out.print(i+" ");
			}
		}
		else if(n2>n1 && n1%2==0) {
			for(int i= n1+2;i<n2;i+=2) {
				System.out.print(i+" ");
			}
		}
		else {
			System.out.println("Los numeros son iguales");
		}

	}

}
