package ordenamiento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

import inout.*;


public class OrdenamientoTest2 {
	



	@Test
	public void testBurbuja() {
		    
	    int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbuja(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

	    Ordena2.burbuja(creciente);
		assertArrayEquals(comparable, creciente);
	    Ordena2.burbuja(decreciente);
	    assertArrayEquals(comparable, decreciente);
	    Ordena2.burbuja(ordenAleatorio);
	    assertArrayEquals(comparable, ordenAleatorio);

	}
	
	@Test
	public void testBurbujaMejorado() {
		    
	    int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbuja(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

	    Ordena2.burbujaMejorado(creciente);
		assertArrayEquals(comparable, creciente);
	    Ordena2.burbujaMejorado(decreciente);
	    assertArrayEquals(comparable, decreciente);
	    Ordena2.burbujaMejorado(ordenAleatorio);
	    assertArrayEquals(comparable, ordenAleatorio);

	}

	@Test
	public void testSeleccion() {
		
		int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbujaMejorado(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

		Ordena2.seleccion(creciente);
		assertArrayEquals(comparable, creciente);
		Ordena2.seleccion(decreciente);
		assertArrayEquals(comparable, decreciente);
		Ordena2.seleccion(ordenAleatorio);
		assertArrayEquals(comparable, ordenAleatorio);
	}

	@Test
	public void testQuicksort() {
		int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbujaMejorado(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

		Ordena2.quicksort(creciente);
		assertArrayEquals(comparable, creciente);
		Ordena2.quicksort(decreciente);
		assertArrayEquals(comparable, decreciente);
		Ordena2.quicksort(ordenAleatorio);
		assertArrayEquals(comparable, ordenAleatorio);

	}

	@Test
	public void testInserccion() {
		int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbujaMejorado(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

		Ordena2.insercion(creciente);
		assertArrayEquals(comparable, creciente);
		Ordena2.insercion(decreciente);
		assertArrayEquals(comparable, decreciente);
		Ordena2.insercion(ordenAleatorio);
		assertArrayEquals(comparable, ordenAleatorio);

	}
	@Test
	public void testHeapsort() {
		int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbujaMejorado(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

		Ordena2.heapsort(creciente);
		assertArrayEquals(comparable, creciente);
		Ordena2.heapsort(decreciente);
		assertArrayEquals(comparable, decreciente);
		Ordena2.heapsort(ordenAleatorio);
		assertArrayEquals(comparable, ordenAleatorio);

	}
	@Test
	public void testMergesort() {
		int[] ordenAleatorio = RandomInts.leerArchivo();
		int[] creciente = ordenAleatorio.clone();
		Ordena2.burbujaMejorado(creciente);
		int[] decreciente = invertido(creciente);
		int[] comparable = creciente.clone();

		Ordena2.mergesort(creciente);
		assertArrayEquals(comparable, creciente);
		Ordena2.mergesort(decreciente);
		assertArrayEquals(comparable, decreciente);
		Ordena2.mergesort(ordenAleatorio);
		assertArrayEquals(comparable, ordenAleatorio);

	}
	
	
	@Test
	public void testTiempos() {
		int[] a = RandomInts.leerArchivo();
		double t1 = System.currentTimeMillis();
		Ordena2.seleccion(a);
		double t2 = System.currentTimeMillis();
		System.out.println("**TIEMPO seleccion=" + (t2 - t1));
	    }
	
	
	
		
	    private int[] invertido(int[] a) {
			int [] inv = a.clone();
			int l = a.length;
			int temp;
			for (int i=0;i<l/2-1;i++) {
				temp = inv[i];
				inv[i] = inv[l-i-1];
				inv[l-i-1] = temp;
			}
			return inv;
		}
	

}


