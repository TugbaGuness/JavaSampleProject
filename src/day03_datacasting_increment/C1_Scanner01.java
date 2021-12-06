package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
	//Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		// Isminiz : Tugba
		// Soyisminiz : Gunes
		// Kursumuza katiliminiz alinmistir tesekkür ederiz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz,\nisminizi yazdiktan sonra lutfen ENTER'a basiniz");
		//syso icinde alt satira gecmek istenildiginde \n yazilir
		//\n den sonra bosluk birakilmamali
		String name=scan.nextLine();
		String surname=scan.nextLine();
		//next sadece ilk kelimeyi alir girilen deger daha uzunsa ilk kelimeden sonrasi kalir
		//next line secilirse o satirin sonuna kadar girilen degerleri alir
		
		System.out.println("Isminiz : "+ name + "\nSoyisminiz : " + surname + "\nKursumuza katiliminiz alinmistir tesekkür ederiz");
		// next ..... yatarauyumazoglu
		//nextLine ..... Can Usta
		
scan.close();
	}

}
