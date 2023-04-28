package Arrays;

public class Array5_DCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*--Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
respectivos precios. Muestra en consola la lista de productos y sus precios.
Por lo menos 5 productos o artículos.--*/
		
		String [] productos = {"Leche", "Refresco","Chocolate","Sabritas","Dulce","Pan"};
		int [] precios = {27,24,12,17,5,8};
		
		/*for(String i: productos) {
			for(int j: precios) {
				System.out.println("El precio del producto: " + i + " es: " + j);
			}
		}*/
		
		
		for (int i=0; i < productos.length; i++) {
			System.out.println("El precio de: " + productos[i] + " es: " + precios[i]);
		}

	}

}
