package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // Stringin palindrome olup olmadigini kontrol eden bir program yazin.

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

