import java.util.Random;

public class RandomArrLetras {

	static final char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static char[] generarArreglo(int cant) {
		Random rnd = new Random();
		char[] arr1 = new char[rnd.nextInt(cant)];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = letras[rnd.nextInt(25)];
		}
		return arr1;
	}
}
