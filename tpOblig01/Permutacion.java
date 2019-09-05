import java.util.Arrays;

public class Permutacion {

	public static boolean sonPermutacion(char[] arr1, char[] arr2) {
		boolean respuesta=false;
		if (arr1 != null && arr2 != null) {
			if (arr1.length == arr2.length) {
				Ordenamiento.countingsort(arr1);
				Ordenamiento.countingsort(arr2);
			}
			if(Arrays.equals(arr1, arr2)) {
				respuesta=true;
			}
		}
		return respuesta;
	}

}
