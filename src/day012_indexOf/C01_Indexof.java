package day012_indexOf;

import java.util.Scanner;

public class C01_Indexof {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve harf isteyin, harfin cumlede var olup olmadigina bakin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		char krk = scan.next().charAt(0);
		int index= cumle.indexOf(krk); //girilen karakterin cumledeki indexi
		if (index<0) {
			System.out.println("Girdiginiz harf girilen cumlede yok");
			
		} else {
			System.out.println("Girdiginiz harf girilen cumlede var");
		}
				scan.close();

	}

}
