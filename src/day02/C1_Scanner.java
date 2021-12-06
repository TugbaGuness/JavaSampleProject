package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
// scanner ile kullanýcýdan bilgi alabiliriz 3 adýmla gerceklestiriyoruz
		//1. adým scanner oluþturacagiz 
		
		Scanner scan=new Scanner(System.in); 
		
		// new gorunce yeni bir object olusturulur
		//parantezin icine yazýlan degere parametre diyoruz
		// 2. adim kullaniciya bir mesaj yazin
		
	System.out.println("Karenin bir kenar uzunlugunu girin");
	
	//3.adim kullanicinin konsola girdigi degeri programa alacagiz 
	double kenar=scan.nextDouble();
	System.out.println("girdiginiz kenar uzunluguna sahip karenin alani="+kenar*kenar);
	scan.close();
	
	
	}

}
