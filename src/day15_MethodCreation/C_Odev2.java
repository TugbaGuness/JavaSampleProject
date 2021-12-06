package day15_MethodCreation;

import java.util.Scanner;

public class C_Odev2 {

	public static void main(String[] args) {
		//Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre

		//- @ isareti icermiyorsa gecersiz email yazdirin
		//- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
		//- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
		
		Scanner scan=new Scanner(System.in);
		String mail=scan.nextLine();
		isaret(mail);
		
	}
	private static void isaret(String mail) {
		
		
	if (!mail.contains("@")) {
		System.out.println("Gecersiz mail adresi");
		
	} else if(!mail.contains("@gmail.com")){
		System.out.println("Lutfen gmail adresinizi girin");

	}else if(mail.endsWith("@gmail.com")){
		System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
	}else {
		
		System.out.println("Basarili giris yaptiniz");
	}
		
	
		
	
	
		
	
	}

}
