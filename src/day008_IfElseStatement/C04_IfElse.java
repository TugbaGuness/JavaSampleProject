package day008_IfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
				//eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
				//Diger durumlarda ekrana  “Eskenar degil” yazdirin.
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ücgenin kenar uzunluklarini yaziniz \nilk kenari girdikten sonra diger kenarlar icin entera basiniz");
		int kenar1= scan.nextInt();
		int kenar2= scan.nextInt();
		int kenar3= scan.nextInt();
		
		//double girilse de uygun olur
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar ücgendir");
		} else {
			System.out.println("Eskenar ücgen degildir");
		}

		
	}
	
}		
			

