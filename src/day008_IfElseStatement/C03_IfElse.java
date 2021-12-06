package day008_IfElseStatement;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		
		//Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
         //65’den buyukse “Emekli olabilirsin” yazdirin
Scanner scan= new Scanner(System.in);
System.out.println("Lutfen yasinizi giriniz");
int yas= scan.nextInt();
if (yas<65 ) {
	System.out.println("Emekli olamazsýn, calýsmalýsýn");
	
} else {
System.out.println("Emekli olabilirsin");
}

scan.close();
	}

}
