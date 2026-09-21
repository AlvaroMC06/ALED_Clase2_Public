package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepcionFile {

	public static void abrirFichero(String s) throws FileNotFoundException {
		FileReader f = new FileReader(s);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		abrirFichero("Direccion");
		System.out.println("Mi programa ha terminado");
	}
}
