package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullaniciya    "Vize sinav sonucunuzu giriniz :"
        2.vize notu double degerinde girilecek.

        3. Kullaniciya  "Vize sinavi yuzdesini giriniz". ->> double olmali� ->> 0,40 etkiliyor   !!Yuzde kac etkiledigini Sisteme siz giriyorsunuz.!!

        4.Kullaniciya    "Final sinav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullaniciya    "Final sinavi� yuzdesini giriniz"-->> double olmali� ->> 0,60 etkiliyor.

        7. Vize final ortalamasini bulmak icin, vize nin yuzde40 i, finalin yuzde60 i alinmali ve cikan sonuclar toplanmalıdır.

        8. cikan sonucu (dersin not ortalamasini)   double toplam  ' a eşitleyebilirsiniz.

        todo  :  Koşul kısmı
 			eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasında ise  
 			BA, 70(70 dahil)   ile 80 arasında ise 
 			BB, 60(60dahil) ile 70 arasında ise 
 			CB, 50(50 dahil) ile 60 arasında ise 
 			CC, 40(40 dahil) ile 50 arasında ise 
 			DC, 30(30 dahil) ile 40 arasında ise 
 			DD, 30 'dan düşük ise FF  gelmeli.
 			
         */
          Scanner scan=new Scanner(System.in);
          System.out.println("Vize sinav sonucunu giriniz");
          double not=scan.nextDouble();
          
          System.out.println("Vize sinav sonucu y�zdeniz");
          double vizeyuzdesi=scan.nextDouble();
          System.out.println("Final sinav sonucunuzu giriniz");
          double finalNot=scan.nextDouble();
          
          System.out.println("Final sinav sonucu y�zdeniz");
          double finalyuzdesi=scan.nextDouble();
          
          double dersinNotOrt=(not*vizeyuzdesi/100)+(finalNot*finalyuzdesi/100);
          System.out.println("Dersin not ortalamasi:" +dersinNotOrt);
          
          if (dersinNotOrt>=90) {
        	  System.out.println("Gecme notunuz: AA");
			
		} else if (dersinNotOrt>=80) {
			System.out.println("Gecme notunuz: BA");
			
		}else if (dersinNotOrt>=70) {
			System.out.println("Gecme notunuz: BB");
			
		}else if (dersinNotOrt>=60) {
			System.out.println("Gecme notunuz: CB");
			
		}else if (dersinNotOrt>=50) {
			System.out.println("Gecme notunuz: CC");
			
		}else if (dersinNotOrt>=40) {
			System.out.println("Gecme notunuz: DC");
			
		}else if (dersinNotOrt>=30) {
			System.out.println("Gecme notunuz: DD");
			
		}else  {
			System.out.println("Gecme notunuz: FF");
				
			}
			
		
			
          
        	  
       
          
          
    }
}
