package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.Permutacion;
import src.RandomArrLetras;

class PermutacionTest {

	@Test
	public void testPermutacion() {
		char[]arr1=null;
		char[]arr2=RandomArrLetras.generarArreglo(4);
		assertFalse(Permutacion.sonPermutacion(arr1, arr2));
		arr1=RandomArrLetras.generarArreglo(5);
		arr2=RandomArrLetras.generarArreglo(6);
		assertFalse(Permutacion.sonPermutacion(arr1, arr2));
		arr1=RandomArrLetras.generarArreglo(1000000);
		arr2=RandomArrLetras.generarArregloPermutacion(arr1);
		assertTrue(Permutacion.sonPermutacion(arr1, arr2));
		char[]arr3= {'a','b','c','c','c'};
		char[]arr4= {'c','c','c','c','a'};
		assertFalse(Permutacion.sonPermutacion(arr3, arr4));
		char[] arr5= {'a','d','c','d','d','a','b','c','c','c'};
		char[] arr6= {'c','a','c','c','c','a','b','d','d','d'};
		assertTrue(Permutacion.sonPermutacion(arr5, arr6));
		char[] arr7= {'a'};
		char[] arr8= {'a'};
		assertTrue(Permutacion.sonPermutacion(arr7, arr8));
		
	}

}

