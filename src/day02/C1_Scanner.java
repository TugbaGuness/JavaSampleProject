package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
// scanner ile kullan�c�dan bilgi alabiliriz 3 ad�mla gerceklestiriyoruz
		//1. ad�m scanner olu�turacagiz 
		
		Scanner scan=new Scanner(System.in); 
		
		// new gorunce yeni bir object olusturulur
		//parantezin icine yaz�lan degere parametre diyoruz
		// 2. adim kullaniciya bir mesaj yazin
		
	System.out.println("Karenin bir kenar uzunlugunu girin");
	
	//3.adim kullanicinin konsola girdigi degeri programa alacagiz 
	double kenar=scan.nextDouble();
	System.out.println("girdiginiz kenar uzunluguna sahip karenin alani="+kenar*kenar);
	scan.close();
	
	
	}

}
