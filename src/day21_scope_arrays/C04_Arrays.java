package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {
	// Tum array icini yazdirmak
	//sort:siralama

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,78,89};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
System.out.println(Arrays.toString(arr));
	}

}
