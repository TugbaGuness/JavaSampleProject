package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
     Scanner scan=new Scanner(System.in);
     System.out.println("Lutfen kilonuzu giriniz");
     double kilo=scan.nextDouble();
     System.out.println("Lutfen boyunuzu giriniz");
     double boy=scan.nextDouble();
     double bedenKętleIndeksi= kilo/(boy/100*boy/100);
     
     
     if (bedenKętleIndeksi<=20) {
    	 System.out.println("Oldukca zayifsiniz");	
	}else if (bedenKętleIndeksi<=25) {
		System.out.println("Normal sinirlardasiniz");
	}else if (bedenKętleIndeksi<=30) {
		System.out.println("Sisman kategorisindesiniz");
	}else if (bedenKętleIndeksi>30) {
		System.out.println("Obez grubundasiniz");
	}else {
		System.out.println("Yalnis girdiniz");
	}
		
     
     
     


    }

}
