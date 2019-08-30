package ordenamiento;

import java.util.Arrays;

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

public class Ordena2 {

	/**
	 * * Metodo de ordenamiento Burbuja * Tiempo de ejecucion: O(n2).
	 */
	public static void burbuja(int[] a) {
		int size = a.length;
		int temp = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (a[j] > a[j + 1]) {
					// swapping elements
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
					// swapping elements
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
			// Looks for the mininum elemnt in the array
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
		sortForQuick(a, 0, a.length - 1);
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

	private static void sortForQuick(int[] a, int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(a, low, high);

			// Recursively sort elements before
			// partition and after partition
			sortForQuick(a, low, pi - 1);
			sortForQuick(a, pi + 1, high);
		}
	}

	/**
	 * Metodo de ordenamiento heapsort. Tiempo de ejecucion O().
	 */

	public static void heapsort(int[] a) {
		int n = a.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			armarHeapMaximo(a, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			// call max heapify on the reduced heap
			armarHeapMaximo(a, i, 0);
		}
	}

	private static void armarHeapMaximo(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			armarHeapMaximo(arr, n, largest);
		}
	}

	/**
	 * Metodo de ordenamiento mergeksort. Tiempo de ejecucion O(n log n).
	 */
	public static void mergesort(int[] a) {
		sortForMerge(a, 0, a.length - 1);
	}

	private static void merge(int[] a, int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	private static void sortForMerge(int a[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sortForMerge(a, l, m);
			sortForMerge(a, m + 1, r);

			// Merge the sorted halves
			merge(a, l, m, r);
		}
	}
}
