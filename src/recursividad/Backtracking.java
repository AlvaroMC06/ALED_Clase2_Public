package recursividad;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {

	public static void backtracking(int[] arr, int objetivo, 
			int acumulado, List<Integer> solucion) {
		
		if (acumulado == objetivo) {
			System.out.println(solucion);
			return;
		}
		
		if (acumulado > objetivo) {
			return;
		}
		
		for(int i : arr) {
			// Probar
			solucion.add(i);
			
			// Exploro
			backtracking(arr, objetivo, acumulado + i, 
					solucion);
		
			// Volver
			solucion.remove(solucion.size() - 1);
		}
		
	}
	
	public static void main(String[] args) {
		backtracking(new int[] {1, 2, 3}, 4, 0, 
				new ArrayList<>());;
	}
}
