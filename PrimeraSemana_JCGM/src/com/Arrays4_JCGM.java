package com;

import java.util.Arrays;

public class Arrays4_JCGM {

	public static void main(String[] args) {
		
//		Dado un array de n�meros de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deber� tener los valores
//		{5,4,3,2,1}.
		
		int[] numOriginal = {1, 2, 3, 4, 5};
        int[] numInvertido = new int[5];

        for (int i = 0; i < numOriginal.length; i++) {
            numInvertido[i] = numOriginal[numOriginal.length - 1 - i];
        }
        
        System.out.println("Array original: " + Arrays.toString(numOriginal));
        System.out.println("Array invertido: " + Arrays.toString(numInvertido));

	}

}