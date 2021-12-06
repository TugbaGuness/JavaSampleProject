package day03_datacasting_increment;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		
		// data casting java da kod yazarken bir veriyi diger veriye koymaya data cevirme denir
				//veri tiplerinde bir variable'a olusturuldugu data tipinden farkli bir data turunden
				//deger atanmasina Data Casting denir
				//birbiriyle donusemeyecek sayilar vardir ali veli sayiya donusemez islem yapilmazsa da stringe cevirilmez
				//sayi olanlar byte-short-int-long-float-double kucukten buyuge
				//1) Auto widening (otomatik genisletme) byte shorta kolayca cevrilir neden short byte dan buyuk
				
		byte sayi1 = 10;
		
		System.out.println("byte degisken ile : " + sayi1);
		short sayi2 = sayi1;
		// short>  byte oldugu icin sikinti yok
		
		System.out.println("short degisken ile : " + sayi2);
		//declaration olusturma = (Assigment Sign atama sembolu) sag taraf value yani deger
		//sayi2 diye variable olusturuldu deger olarak sayi1 in degeri atandi
		
		int sayi3 = sayi2;
		System.out.println("int degisken ile : " + sayi3);
		// sayilar ayni ama hafizada kapladigi alan artti
		
		float sayi4= sayi3;
		System.out.println("float degisken ile : " + sayi4);
		
		double sayi5 = sayi2;
		System.out.println("double degisken ile : " + sayi5);
		

	}

}
