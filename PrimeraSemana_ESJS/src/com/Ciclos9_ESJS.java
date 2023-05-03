package com;

import java.util.Scanner;

public class Ciclos9_ESJS {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números pares entre ellos
		
		int num1=0;
		int num1c=0;
		int num2=0;
		int num2c=0;
		int total=0;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame el primer número");
		num1=entrada.nextInt();
		
		System.out.println("Dame el segundo número");
		num2=entrada.nextInt();
		
		if(num1<num2) {
			num1c=num1;
			for(int i=0;i<=(num2-num1);i++) {
			
				total=num1c%2;
				if(total==0) {
				System.out.println(num1c);
				
				}else {}
				num1c=num1c+1;
			}
		}else if(num1>num2) {
			num2=num2;
			for(int i=0;i<=(num1-num2);i++) {
				

				total=num2c%2;
				if(total==0) {
				System.out.println(num2c);
				
				}else {}
				num2c=num2c+1;
				
			}
		}else {
			
		}

	}

}
