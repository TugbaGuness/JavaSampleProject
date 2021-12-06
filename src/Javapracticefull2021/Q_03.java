package Javapracticefull2021;

import java.lang.ProcessHandle.Info;
import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz:");
		
		//ln olunca alt satýra yazdýrýr silersek yana
		String isim= scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz:");
		String soyisim= scan.nextLine();
		
		System.out.println("Lutfen yasinizi giriniz:");
		int yas= scan.nextInt();
		
		System.out.println("Lutfen boyunuzu giriniz:");
		double boy= scan.nextDouble();
		
		System.out.println("Lutfen kilonuzu giriniz:");
		double kilo= scan.nextDouble();
		
		System.out.println("isim:" +isim+ "\n" +"soyisim:" +soyisim+"\n" +"yas:"+yas+ "\n" +"boy:"+boy+ "\n" +"kilo:" +kilo);
	}

}
