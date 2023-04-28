package Arrays;

import java.util.Scanner;

public class Arrays3_DCC {

	public static void main(String[] args) {
		/*--Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		caracteres.--*/
		
		String frase;
		int i;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");
		frase = lector.next();
		i = frase.length();
		
		char [] arrayFrase = new char[i];
		
		for(int j = 0; j < frase.length(); j++) {
			arrayFrase[j] = frase.charAt(j);
			System.out.println(arrayFrase[j]);
		}
		
		

	}

}
