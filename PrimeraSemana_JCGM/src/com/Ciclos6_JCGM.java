package com;

public class Ciclos6_JCGM {

	public static void main(String[] args) {
	
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
//		mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
//		todo el dinero lo reinvierte?

		
		double capital = 1000.00;
       
        
        double capitalFinal = capital;
        
        for (int i = 1; i <= 12; i++) {
            capitalFinal += capitalFinal * 0.02;
        }
        
        System.out.println("El saldo final es: $" + String.format("%.2f", capitalFinal));

	}

}
