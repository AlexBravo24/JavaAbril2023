package Arrays;

public class Array4_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1, 2, 3, 4, 5};
		int cont = array1.length;
		int [] arrayInvertido = new int [cont];
		
		for(int i = 0; i < array1.length; i++) {
			arrayInvertido[i] = array1[cont-1 -i];
		}
		
		System.out.println("El array original es: ");
		
		for(int i: array1) {
			System.out.println(i);
		}
		
		System.out.println("El array invertido es: ");
		for(int j: arrayInvertido) {
			System.out.println(j);
		}
		

	}

}
