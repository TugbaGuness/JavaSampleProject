package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Korln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyati hesabi = Her 20 Km basina 5 euro. Orn: (100 km yol. Bilet parasi  (100/20)* 5 =25 euro

todo IPUCU:  toplamTutar, islem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri olusturabilirsiniz. Islemlerde direkt bunlari carpabilirsiniz.
        todo ILK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Korln : 80 KM ---       (20 KM basina 5 euro bilet parasi alinmaktadir..)    yazisi gelsin.
    1.    Frankfurt veya Koln olarak bir giris yapin. (Girdiginiz sehrin harfleri , girildikten sonra buyuk hale gelsin.
   todo    Frankfurt girildiyse,
        Korln: girdi= Frankfurt
                case=FRANKFURT  Rota = Frankfurt yazdirin.
      Frankfurt km hesabi islemi yapin.
      son olarak konsolda: Frankfurt 15 Euro         yazsin.
      todo  case: KolN ise
      "Rota = Koln" yazdirin.
       km hesabina gore islemi yapiniz.
       son olarak konsolda:  Koln   20 Euro   yazsin.
       
         */
       
       Scanner scan= new Scanner(System.in);
       System.out.println("Nereye yolculuk etmek istiyorsunuz?");
       System.out.println("Frankfurt : 60 KM          ---         Koln : 80 KM ---       20 KM basina 5 euro bilet parasi alinmaktadir..");
       String sehir= scan.next().toUpperCase();
       System.out.println(sehir);
       if (sehir.equals(sehir)) {
    	   System.out.println("case=" +sehir + "   Rota=" +sehir );
    	   System.out.println("Frankfurt km hesabi:" +(3*5) +"Euro");
	} else {
		System.out.println("case=" +sehir + "   Rota=" +sehir); 
 	    System.out.println("Koln km hesabi:" +(4*5) +"Euro");
 	    {
	}
      
       }  

       
       
       
       
       


    	 /*
       2.  Sistem bize "Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kisilik " yazdirin. (1 kisilik secerseniz bir islem yapmaniza gerek kalmaz, bilet ucreti yukarida coktan belirlenmis olur.)

        case:2 ise

        "2 kisilik " yazdirin
        2 kisci iin bilet fiyatini hesaplayin.


        todo  Son olarak yolculugunuzu check edin;

        konsolda Kolrn:   Frankfurt  - 2 Kisilik    yazsin.

        1.Bakiyemi belirtin.
        2.Toplam Tutari belirtin.
        3.double paraUstu olusturun ve hesaplayin.
        4.Double para ustunu yazdirin.


         */

      System.out.println("Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):");
      int sayi=2;
      switch (sayi) {
      case 1:
    	  System.out.println("1 kisilik");
    	  System.out.println("Bilet fiyatiniz yukarida belirtildigi gibidir");
    	  break;
      case 2:
    	  System.out.println("2 kisilik");
    	  if (sehir.equals(sehir)) {
       	   System.out.println("Bilet fiyati:" +(3*5*2) +"Euro");
       	   System.out.println("Frankfurt: 2 kisilik");
   	} else {
    	    System.out.println("Bilet fiyati:" +(4*5*2) +"Euro");
    	    System.out.println("Koln: 2 kisilik");
   	}
    	  
    	  break;
   
    	


    
      }
	}

    }

