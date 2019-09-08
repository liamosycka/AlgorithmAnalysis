package src;
import java.util.Arrays;

import metodos_ordenamiento.CountingSort;
/*Integrantes: 	Montiel Edison    FAI - 660
				Osycka Liam        FAI - 1891
				Campetella Mariano    FAI - 494
*/

public class Permutacion {

	public static boolean sonPermutacion(char[] arr1, char[] arr2) {
		boolean respuesta=false;
		if (arr1 != null && arr2 != null) {
			if (arr1.length == arr2.length) {
				CountingSort.sort(arr1);
				CountingSort.sort(arr2);
			}
			if(Arrays.equals(arr1, arr2)) {
				respuesta=true;
			}
		}
		return respuesta;
	}

}
