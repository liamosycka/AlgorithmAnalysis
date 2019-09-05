
public class Ordenamiento {
	
	public static void heapsort(char[] a) {
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
	public static void countingsort(char arr[]) 
    { 
        int n = arr.length; 
  
        // The output character array that will have sorted arr 
        char output[] = new char[n]; 
  
        // Create a count array to store count of inidividul 
        // characters and initialize count array as 0 
        int count[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            count[i] = 0; 
  
        // store count of each character 
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 
  
        // Change count[i] so that count[i] now contains actual 
        // position of this character in output array 
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
  
        // Build the output character array 
        // To make it stable we are operating in reverse order. 
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
  
        // Copy the output array to arr, so that arr now 
        // contains sorted characters 
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
    } 

}
