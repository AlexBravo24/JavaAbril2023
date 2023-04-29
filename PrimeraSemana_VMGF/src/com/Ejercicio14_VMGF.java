package com;

import java.util.Scanner;

public class Ejercicio14_VMGF {

	public static void main(String[] args) {
		// salario
		
		int hora, horaextra;
		float salario, salariof,montoextra;

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa el numero de horas trabajadas:  ");
		hora =sc.nextInt();
		
		if (hora<=40) {
			salario=hora*16;
			System.out.println("Salario total de:" +salario);		
			
		}else if (hora>40) {
			horaextra=hora-40;
			montoextra=horaextra*20;
			salariof= ((40*16)+(montoextra));
			System.out.println("Cantidad de horas extras es: : "+horaextra);		
			System.out.println("Salario total : "+salariof);		
		}		
		
		
		
		

	}

}
