package day16_forLoop;

import java.util.Scanner;

public class C08_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin 
		//ve Stringi tersine ceviren bir method yazin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz");
		String str=scan.nextLine();
		tersinecevir(str); //yazdirmak icin syso icine bunu al yazdir
		
		
		//cekoslavakyalilastiramadiklarimizdanmisiniz

		
	}

	private static String tersinecevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
		tersStr+=str.substring(i,i+1);
			
		
			
		}
		return tersStr;
	}

}
