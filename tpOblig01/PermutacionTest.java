import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutacionTest {
	

	@Test
	public void testPermutacion() {
		char[] arr1=RandomArrLetras.generarArreglo();
		char[] arr2=RandomArrLetras.generarArreglo();
		assertNotNull(arr1);
		assertNotNull(arr2);
		Ordenamiento.heapsort(arr1);
		Ordenamiento.heapsort(arr2);
		assertArrayEquals(arr1,arr2);
	}

	private void assertArrayLength(char[] arr1, char[] arr2) {
		// TODO Auto-generated method stub
		
	}

}
