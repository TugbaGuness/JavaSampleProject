package day003;

public class C03_Datacasting {

	public static void main(String[] args) {
		
		byte sayi1=44;
		short sayi2= sayi1;
		
		//itiraz yok kücük olani büyüge atiyoruz cunku
		//ıkı data turu farkli oldugu halde
		//atama yapilan variable in data turu short
		//atanan degerin veri turunden (byte) buyuk oldugundan sorun olmadi
		
		System.out.println("sayi2="  +sayi2);

		int sayi3= 55;
		double sayi4= sayi3;
		
		System.out.println("sayi4="  +sayi4);
		
		//atanan degerin data turu deger atanan variable'in data turunden kucuk ise
		//Java castingi otomatik yapar
		//bu isleme auto widening denir
	}

}
