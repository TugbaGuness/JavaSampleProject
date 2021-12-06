package day30_staticBlocks;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar[]= {3,4,5,6};
		elemanDegistir(sayilar);
		System.out.println("eleman degistir methodu sonrasi:" +Arrays.toString(sayilar));
		//eleman degistir methodu sonrasi:[10, 4, 5, 6]
		ArrayDegistir(sayilar);
		System.out.println("Method sonrasi array degistir:" +Arrays.toString(sayilar));
		//Method sonrasi array degistir:[10, 4, 5, 6]
		
		
	}

	private static void ArrayDegistir(int[] sayilar) {
		sayilar=new int[6];
		System.out.println("array degistir:" +Arrays.toString(sayilar));
		//array degistir:[0, 0, 0, 0, 0, 0]
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0]=10;
		System.out.println("eleman degistir:" +Arrays.toString(sayilar));
		//leman degistir:[10, 4, 5, 6]
	}

}
