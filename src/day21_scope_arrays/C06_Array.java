package day21_scope_arrays;

import java.util.Arrays;

public class C06_Array {

	public static void main(String[] args) {
		//Verilen bir array’in tum 
		//elemanlarini toplayan bir program yazalim.
		
int arr[]= {2,4,5,78,8,89};
int toplam=arr[0];
System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
			
		}
		System.out.println(toplam + " ");
		
		
		//arrayýn tum elemanlarýný buyukten kucuge kucukten buyuge sýrala
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//buyuktan kucuge yazdirmak icin
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println(" ");
		//ters yazdirmak icin yeni array olusturup tasiyabilirix
		
		int tersArray[]=new int[arr.length];
		for (int i = 0; i< tersArray.length; i++) {
		
		          tersArray[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
		
	}

	}


