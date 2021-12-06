package day02VariableScanner;

import java.util.Scanner;

public class C03VariableScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		//Kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakin yazdirin
				//isim - soyisim : Tugba Gunes
				
				System.out.println("Lutfen isminizi giriniz");
				String name= scan.next();
				System.out.println("Lutfen soyisminizi giriniz");
				String surname= scan.next();
				
				System.out.println("Ýsim - soyisim : " + name + " "+surname);
				
				// Variable
				
				// print yaparken variable degerini yazdirmak icin syso variable ismi yazilir
				//aciklama yazdirmak icin "" icine herseyi yazabiliriz
				// hem aciklama hem variable varsa aciklama """icine sadece variable ismi ve aralarinda +
				//eger aciklama ile birlikte matematiksel bir islem yapiyorsak
				//matematiksel ifadeyi parantez icine almaliyiz
				// Java'da variable isimleri CASE SENSITIVE'dir. money, Money, MONEY farklidir
				// Ýki farkli sayi turunde degerin toplamini yazdirmak istersek Java daha genis olani tercih eder
				// eger char matematiksel islemde kullanilirsa Java Ascii degeri kullanir
				
				
				//Scanner icin 3 adim takip edilir
				// 1. scanner objesi olusturmak (Scanner Class'i import etmeliyiz)
				// 2.adim kullanicidan istedigimiz bilgiyi acik sekilde konsoldan yazdirmak
				// next method'unu kullanarak kullanicidan aldigimiz degeri, olusturdugumuz variable'a atamaliyiz.
				// Olusturdugumuz variable ve kullandigimiz next methodu kullanicidan istedigimiz dataya uygun olmalidir
				scan.close();
				
				

	}

}
