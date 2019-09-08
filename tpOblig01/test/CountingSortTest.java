package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metodos_ordenamiento.CountingSort;
import metodos_ordenamiento.HeapSort;
import src.RandomArrLetras;

/*Integrantes: 	Montiel Edison    FAI - 660
				Osycka Liam        FAI - 1891
				Campetella Mariano    FAI - 494
*/
class CountingSortTest {

	@Test
	public void testCountingSort() {
		char[] arr = RandomArrLetras.generarArreglo(100);
		char[] arrDup = arr.clone();
		HeapSort.sort(arrDup);
		CountingSort.sort(arr);
		assertArrayEquals(arr, arrDup);
		arr = RandomArrLetras.generarArreglo(1000);
		arrDup = arr.clone();
		HeapSort.sort(arrDup);
		CountingSort.sort(arr);
	}

	@Test
	public void testTiempos() {
		char[] arr = RandomArrLetras.generarArreglo(1000000);
		double t1 = System.currentTimeMillis();
		CountingSort.sort(arr);
		double t2 = System.currentTimeMillis();
		System.out.println("**TIEMPO countingsort=" + (t2 - t1));
	}

}
