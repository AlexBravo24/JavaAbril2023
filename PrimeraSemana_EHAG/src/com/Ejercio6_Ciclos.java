package com;

public class Ejercio6_Ciclos {
	public static void main(String[] args) {
		double capital = 1000.00;
        double interes = 0.02;
        
        for (int mes = 1; mes <= 12; mes++) {
            capital += capital * interes;
        }
        
        System.out.printf("Despu�s de un a�o, la persona tendr� $%.2f\n", capital);
    }

	}


