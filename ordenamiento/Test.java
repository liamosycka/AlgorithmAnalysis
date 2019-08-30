package ordenamiento;

import java.util.Arrays;

import inout.RandomInts;

public class Test {

	public static void main(String [] args) {
		int[]arr=new int[15];
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
		}
		
		System.out.println("Arr desordenado : "+Arrays.toString(arr));
		Ordena2.heapsort(arr);
		System.out.println("arr ordenado "+Arrays.toString(arr));
		
	}
}

