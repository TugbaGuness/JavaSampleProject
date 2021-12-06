package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arası - C   
		// 3. 60(dahil) ile 80 arası - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		Scanner scan= new Scanner(System.in);
		
        
		System.out.println("Lutfen notunuzu giriniz");
		String islemler= "1.islem : Notunuz 0-50 arasi\n2.islem : Notunuz 50-60 arasi\n"
                + "3.islem : Notunuz 60-80 arasi\n"
                + "4.islem : Notunuz 80 �st�";
		System.out.println(islemler);
		String not= scan.next();
		switch (not) {
		case "1":
			System.out.println("Notunuz: D");
			break;
		case "2":
			System.out.println("Notunuz: C");
			break;
		case "3":
			System.out.println("Notunuz: B");
			break;
		case"4":
			System.out.println("Notunuz: A");
			break;
			default:
			System.out.println("Gecersiz not");
	
			
	
		}
	
	}
}
