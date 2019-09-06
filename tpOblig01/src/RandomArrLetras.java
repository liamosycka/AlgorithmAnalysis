import java.util.Random;

public class RandomArrLetras {

	static final char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static char[] generarArreglo(int cant) {
		Random rnd = new Random();
		char[] arr = new char[cant];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = letras[rnd.nextInt(25)];
		}
		return arr;
	}

	public static char[] generarArregloPermutacion(char[] arr) {
		char[] arrPermutacion = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrPermutacion[i] = arr[arr.length - 1 - i];
		}
		return arrPermutacion;
	}
}
