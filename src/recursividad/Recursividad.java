package recursividad;

public class Recursividad {
	
	// Cuenta atrás hasta cero
	public static void cuentaAtras(int n) {
		if (n == 0) { // Caso base
			System.out.println(0);
			return;
		}
		
		System.out.println(n);
		cuentaAtras(n - 1); // Caso recursivo
	}
	
	// suma n
	public static int suma(int n) {
		if (n == 0) {
			return 0;
		}
		int recuento = suma(n - 1);
		return n + recuento;
	}
	
	// dada una pos de un array, sumar todos los valores siguientes
	public static int sumaArray(int[] arr, int i) {
		if (i == arr.length - 1) {
			return arr[i];
		}
		return arr[i] + sumaArray(arr, i + 1);
	}
	
	
	public static void main(String[] args) {
		// cuentaAtras(5);
		// System.out.println(suma(5));
		System.out.println(sumaArray(new int[] {1, 2, 3, 4}, 0));
	}

}
