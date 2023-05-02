package com;

import java.util.Scanner;

public class CICLOS8_JGGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor 
		 */
		int num1=0;
		int num2=0;
		int total=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("dame el primer numero");
		num1=entrada.nextInt();
		System.out.println("dame el segundo numero");
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
