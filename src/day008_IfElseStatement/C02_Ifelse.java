package day008_IfElseStatement;

import java.util.Scanner;

public class C02_Ifelse {

	public static void main(String[] args) {
		//kullanicidan bir karakter girmesini isteyin
		//girilen karakterin harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter <='Z') || (karakter>='a' && karakter <='z')) {
			System.out.println("girdiginiz:" + karakter + " bir harftir");
			
		} else {

			System.out.println("girdiginiz:" + karakter + " bir harf degildir");
			
			
		}
		

	}

}
