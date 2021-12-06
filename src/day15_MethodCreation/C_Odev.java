package day15_MethodCreation;

import java.util.Scanner;

public class C_Odev {

	public static void main(String[] args) {
		//Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
	//kucuk mu oldugunu, ayrica ve 100�den buyukse birler,onlar ve yuzler basamagindaki
	//rakamlarin toplamini,100�den kucukse sadece 1�ler basamagini yazdiran 3 method
	//olusturun.
		
	Scanner scan= new Scanner(System.in);
	double sayi=scan.nextDouble();
	tekC�ftOlmasi(sayi);
	sifirdanBuyukKucukOlmasi(sayi);
	yuzdenBuyukKucukOlmasi((int) sayi);

    
	}

	private static void yuzdenBuyukKucukOlmasi(int sayi) {
		if (sayi>100) {
		int birler= sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler= sayi/100;
		System.out.println("Birler+Onlar+Yuzler basamag� toplam�:" +((birler+onlar)+yuzler));
		
		} else if(sayi<100){
			int birler= sayi%10;
			System.out.println("Sayinin birler basamagi:" +birler);

		}else {
			System.out.println("Sayi yuze e�ittir");
		}
		
	}

	private static void sifirdanBuyukKucukOlmasi(double sayi) {
		if (sayi>0) {
			System.out.println("Sifirdan buyuktur");
		} else if(sayi<0){
			System.out.println("Sifirdan kucuktur");

		}else {
			System.out.println("Sayi sifira e�ittir");
		}
		
	}

	private static void tekC�ftOlmasi(double sayi) {
		if (sayi%2==0) {
			System.out.println("Bu bir cift sayidir");
		} else{
			System.out.println("Bu bir tek sayidir");

		}

		
	}

}
