package day_replit;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Array {

	public static void main(String[] args) {
		
		/*Write a return method to reverse number.

Input : 12345

Output : 54321*/
		
		Scanner scan=new Scanner(System.in);
		String sayi=scan.nextLine();
		
		String sayi1[]=sayi.split("");
		
		for (int i = sayi1.length-1; i >=0; i--) {
			System.out.print(sayi1[i]);
			
		}
		

	}

}
