package day010_Ternary;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// kullanicidan bir sayi alýn
		//sayi pozitifse pozitif yazdirin
		//sayi negatif ise karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi= scan.nextDouble();
		
		System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);

	}

}
