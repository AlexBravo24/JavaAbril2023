package Arrays;

public class Array2_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*--Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
			1 al 100. Obt�n la suma de todos ellos y la media.--*/
		
		int [] numeros = new int [100];
		int suma = 0;
		int contador = 0;
		int media;
		
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = i;
			System.out.println(numeros[i]);
			contador = i+1;
			
		}
		
		suma = (contador * (contador +1))/2;
		media = suma/contador;
		
		
		System.out.println("La suma de todo el array es: " + suma);
		System.out.println("La media de todo el array es: " + media);

	}

}
