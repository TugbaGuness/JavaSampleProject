package day21_scope_arrays;

import java.util.Arrays;

public class Co5_Array {

	public static void main(String[] args) {
		//Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. 
		//Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
			int arr[]= {1,2,3};
		int bos=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
			
	}
		arr[arr.length-1]=bos;
System.out.println(Arrays.toString(arr));
	}
}
