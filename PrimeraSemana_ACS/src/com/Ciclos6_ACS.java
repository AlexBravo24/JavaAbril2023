package com;

import java.util.Scanner;

public class Ciclos6_ACS {

	
	public static void main(String[] args) {
		
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad 
		//de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.

		Scanner sc = new Scanner(System.in);
		
		double inversion = 1000.00;
        double intereses;
        int mes = 0;
       
        while (mes <=0) {
            mes++;
            intereses = inversion * 0.02 * 12;
            System.out.println("mes: " + mes + "\12"
                    + "intereses: " + String.format("%.2f", intereses) + "\n"
                    + "inversion: " + String.format("%.2f", inversion) + "\n"
                    + "inversión al año es: " + String.format("%.2f", (inversion + intereses)) + "\n");
            inversion += intereses;
         
            System.out.println((mes + intereses ));
        }
    }

}
