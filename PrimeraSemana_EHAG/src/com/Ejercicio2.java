package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
Scanner numero = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = numero.nextInt();
        //numero.close(); para serrar el escaner
        
        int salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 16;
        } else {
            salarioSemanal = 40 * 16 + (horasTrabajadas - 40) * 20;
        }
        
        System.out.println("El salario semanal es de $" + salarioSemanal);

	}

}
