package day01_grupCalismasi;

import java.util.Scanner;

public class C01_Soru1 {

	public static void main(String[] args) {
		// 1 - ) Kullaniciya gunde kac saat uyudugunu sorun, ayda yilda 
		 //   ve 40 yilda kac gununun uykuda gectigini yazdirin
	      // Ornek Ekran Ciktisi:
	        //Input : 8
	       // Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gunde kac saat uyuyorsunuz?");
		double uykuSaati= scan.nextDouble();
		System.out.println("Ayda uyudugunuz gun sayisi:" +(uykuSaati*30)/24);
		System.out.println("Yilda uyudugunuz gun sayisi:" +(uykuSaati*365)/24);
		System.out.println("40 yilda uyudugunuz gun sayisi:" +(uykuSaati*365*40)/24);

	}

}
