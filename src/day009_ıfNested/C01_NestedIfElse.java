package day009_ýfNested;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		// kullanicidan bir sifre girmesini isteyin
		//eger ilkharf buyuk harf ise a olup olmadigini kontrol edin
		//A ise gecerli sifre degilse gecersiz sifre
		//ilk harf kucuk harf ise z olup olmadigini kontrol
		// edin z ise gecerli degilse gecersiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		char harf= scan.next().charAt(0);
		
		if (harf>='A' && harf<='Z') { //buyuk harfleri sececek
			if (harf=='A') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		} else if(harf>='a' && harf<='z'){ //kucuk harfleri sececek
            if (harf=='z') {
            	System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}
		}else { //geriye kalan tum karakterler
			System.out.println("Gecerli sifre olmasi icin harf ile baslayiniz");
		}
		
		

	}

}
