package day001_day002;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		//Scanner isleminde string icin iki method
		//scan.next() dedigimizde sadece bir kelime alir
		//kullanicidan daha fazla kelime gelme ihtimali varsa scan.nextLine() olmalidsir
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Lutfen isminizi yaziniz");
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz");
		String soyisim=scan.nextLine();
		System.out.println("Girilen isim =" + isim + " " + soyisim);
				
	}

}
