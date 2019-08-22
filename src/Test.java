package src;

import java.util.Arrays;

public class Test {

	public static void main(String [] args) {
		int[]arr=new int[15];
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
		}
		
		System.out.println("Arr desordenado : "+Arrays.toString(arr));
		Ordena.quicksort(arr);
		System.out.println("Arr ordenado: "+Arrays.toString(arr));
	}
}

