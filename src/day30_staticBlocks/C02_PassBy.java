package day30_staticBlocks;

public class C02_PassBy {

	public static void main(String[] args) {
		// biz 100 tl ye satilan bir urun icin
		//2 farkli indirim uygulayan iki method olusturalim
		
		
		int fiyat=100;
		indirimYap25(fiyat);
		System.out.println(fiyat);//100
		indirimYap10(fiyat);
		System.out.println(fiyat);//100
		}
		
	//method altina return edersek yukarida yazdirinca syso(indirimYap25(fiyat)); degisim olan deger yazar
	// assign edersek fiyat=indirimYap25(fiyat); o zaman kalici degistirir
	//value=deger
	/*Bunu bir de adres bulma analojisinden izah edebilirim. Ornegin sana bir kagit verdim, kagitta evimin adresi yaziyor.
Sen bu kagidin uzerindeki adresi silip, yerine baska bir evin adresini yazarsan:
- Bu kagida bakarak benim evin adresini bulmak isteyen tum insanlar artik yeni evin adresini gorurler. Cunku sen direkt olarak referansi degistirdin.
- Benim adresimin bulundugu kagidin sana sadece bir kopyasini verdim, sen ona istedigini yaz. Sadece kendi baktigin adresi degistirirsin, diger herkes ayni sekilde benim evimin adresini okumaya devam ederler. ---> Pass by value budur.
Eger sen evin icerisinde bir sey degistirmek istersen, adresteki evi bulup, icerisinde istedigin degisikligi yapabilirsin. Ama sana verdigim kagida ne yazarsan yaz, diger insanlarin referansi uzerinde degisiklik yapamadigin icin senin disindaki insanlar ( scope disindakiler ) etkilenmezler.*/

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat: "+fiyat);//%25 indirimli fiyat: 75
		//scope ici fiyat degisiyor ama yukarida methodda yine aynisi yaziyor ki
		//bir sonrakinde indirimli fiyat olmasin
		
	}

	private static void indirimYap10(int fiyat) {
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat: "+fiyat);//%10 indirimli fiyat: 90
		
	}

}
	
