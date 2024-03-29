package metodos_ordenamiento;
/*Integrantes: 	Montiel Edison    FAI - 660
				Osycka Liam        FAI - 1891
				Campetella Mariano    FAI - 494
*/

public class HeapSort {
	public static void sort(char[] a) {
		int n = a.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			armarHeapMaximo(a, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			char temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			// call max heapify on the reduced heap
			armarHeapMaximo(a, i, 0);
		}
	}

	private static void armarHeapMaximo(char arr[], int n, int i) {
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
			char swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			armarHeapMaximo(arr, n, largest);
		}
	}

}
