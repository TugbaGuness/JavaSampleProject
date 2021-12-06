package day03_datacasting_increment;

public class C4_DataCasting {

	
	public static void main(String[] args) {
		double sayi1 = 1000.14;
		int sayi2 = (int) sayi1;
		// þimdi kucukten buyuge oldugu icin hata cikariyor otomatik  cevrilmez manuel onay ister
		// esitligin sagina (int) yazilir sorumluluk bu kodu yazanda der ve castingi yapar
		// ama data kayiplari ve data degisimleri olabilir
		//3.14 olmayacak 3 olacak
		System.out.println("double degisken : " + sayi1);
		System.out.println("int degisken : " + sayi2);
		
		byte sayi3 = (byte) sayi2;
		System.out.println("byte degisken : " + sayi3);
		//Javada explicit narrowing data casting yapilirken data kayiplari olabilir
		
		int sayi4 = 95;
		int sayi5 = 5;
		System.out.println("bolme sonucu : " + sayi4/sayi5);
		// paranteze alinmadi ama java matematik bilir once bolme yapar
		
		//bolunen sayi ve bolen sayi ikiside int ise java sonucu int verir
		double sayi6 = 2000;
		System.out.println(sayi6/sayi5);
		
		double sayi7 = 5;
		System.out.println(sayi4/sayi7);
		
		

	}

}
