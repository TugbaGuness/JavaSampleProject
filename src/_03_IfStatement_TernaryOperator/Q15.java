package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<0) {
			sayi=-1*sayi;
			System.out.println("Girdiginiz sayinin mutlakdegeri:" +sayi);
		} else if(sayi>0){
			System.out.println("Girdiginiz sayinin mutlakdegeri:" +sayi);
		}else {
			System.out.println("Girdiginiz sayi 0'dir. Mutlak degeri yoktur.");
		}
		
		
		
		
		
	}

}
