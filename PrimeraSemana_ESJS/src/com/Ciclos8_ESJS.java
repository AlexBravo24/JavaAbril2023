package com;

import java.util.Scanner;

public class Ciclos8_ESJS {

	public static void main(String[] args) {
//		//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
//		mayor 
		
		int num1=0;
		int num2=0;
		int total=0;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame el primer n�mero");
		num1=entrada.nextInt();
		
		System.out.println("Dame el segundo n�mero");
		num2=entrada.nextInt();
		
		if(num1<num2) {
			for(int i=0;i<=(num2-num1);i++) {
				
				total=num1+i;
				System.out.println(total);
			}
		}else if(num1>num2) {
			for(int i=0;i<=(num1-num2);i++) {
				
				total=num2+i;
				System.out.println(total);
			}
		}else {
			
		}
		
		
	}

}
