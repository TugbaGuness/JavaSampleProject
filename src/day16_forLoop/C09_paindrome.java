package day16_forLoop;

import java.util.Scanner;

public class C09_paindrome {

	public static void main(String[] args) {
		// Interview Question Kullanicidan bir String isteyin. 
		//Kullanicinin girdigi String’in palindrome 
		//olup olmadigini kontrol eden bir program yazin.
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz");
		String str=scan.nextLine();
		tersinecevir(str); //yazdirmak icin syso icine bunu al yazdir
		
		if (str.equals(tersinecevir(str))) {
			System.out.println("girdiginiz string palindrome");
			
		}else {
			System.out.println("girdiginiz string palindrome degil");
		}
		

		
	}

	private static String tersinecevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
		tersStr+=str.substring(i,i+1);
			
		
			
		}
		return tersStr;
	}




	}


