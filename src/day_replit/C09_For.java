package day_replit;

import java.util.Scanner;

public class C09_For {

	public static void main(String[] args) {
		/*Kullan�c�n�n girdi�i say�y� tersine �eviren bir java program� yaz�n�z. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir sayi giriniz");
		int sayi=scan.nextInt();
		String str=String.valueOf(sayi);
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.substring(i,i+1));
			
		}
		
	}




	}


