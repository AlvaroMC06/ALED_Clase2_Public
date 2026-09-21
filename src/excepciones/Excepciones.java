package excepciones;

public class Excepciones {
	
	public static int accederValor(int[] arr, int i) {
		
		int e = Integer.parseInt("abc");
		int valor = arr[i];
		System.out.println("valor: " + valor);
		return valor;
	}

	
	public static void main(String[] args) {
		System.out.println("Empieza mi programa!");
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(accederValor(arr, 5));
		}
		catch (Exception e) {
			System.out.println("Ese índice no es válido");
		}
		
		
	}
}
