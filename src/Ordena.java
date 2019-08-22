package src;

/**
 * @author LiamOsycka
 *
 */

/*
 * Analisis de Algoritmos 2019.
 * 
 * Ejercicio Martes 20/08/2019 . Implementar en Java los siguientes algoritmos
 * de ordenamiento
 */

public class Ordena {

	/**
	 * * Metodo de ordenamiento Burbuja * Tiempo de ejecucion: O(n2).
	 */
	public static void burbuja(int[] a) {
		int size = a.length;
		int temp = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (a[j] > a[j + 1]) {
					// cambia los elementos
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void burbujaMejorado(int[] a) {
		int size = a.length;
		int temp = 0;
		boolean swapped;
		for (int i = 0; i < size - 1; i++) {
			swapped = false;
			for (int j = 0; j < (size - i - 1); j++) {
				if (a[j] > a[j + 1]) {
					// cambia los elementos
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

	/**
	 * Metodo de ordenamiento por seleccion. Tiempo de ejecucion O(n2).
	 */

	public static void seleccion(int[] a) {
		int size = a.length;
		int temp = 0;
		for (int i = 0; i < size - 1; i++) {
			// Busca el minimo elemento del arreglo
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}

	}

	/**
	 * Metodo de ordenamiento por insercion directa. Tiempo de ejecucion O(n2).
	 */

	public static void insercion(int[] a) {
		int size = a.length;
		for (int i = 1; i < size; ++i) {
			int key = a[i];
			int j = i - 1;

			/*
			 * Move elements of a[0..i-1], that are greater than key, to one position ahead
			 * of their current position
			 */
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}

	/**
	 * Metodo de ordenamiento quicksort. Tiempo de ejecucion O(n log n).
	 */

	public static void quicksort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (a[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;

		return i + 1;
	}

	private static void sort(int[] a, int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(a, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

}
