package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf= scan.next().charAt(0);
		
		if (harf>='A' && harf<='Z') { //buyuk harfleri sececek
		 {
				System.out.println("Buyuk Harf");
			}
		} else if(harf>='a' && harf<='z'){ //kucuk harfleri sececek
          {
            	System.out.println("Kucuk Harf");
			}
		}else { //geriye kalan tum karakterler
			System.out.println("Gecerli sifre olmasi icin harf ile baslayiniz");
		
		
		}
	}

}
