package day20_scope;

public class InstanceVar2 {
	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;

	public static void main(String[] args) {
		// instance variable'lara main methottan direk ulasilamaz
//obje olusturarak
		//class ismi koplaya ve Scanner gibi olustur
		
		InstanceVar2 ali=new InstanceVar2();
		System.out.println(ali.adres); // Ankara
		System.out.println(ali.dogumYeri); // null
		System.out.println(ali.notOrtalamasi); //0.0
		System.out.println(ali.yasOrt); //12.3
		System.out.println(ali.cinsiyet); //E
		System.out.println(ali.karakter); //bosluk
		System.out.println(ali.ogrenciMi); //true
		System.out.println(ali.izinliMi); //false
		
		
		
	}
public static void staticMEthod() {
	// instance variable'lara static methottan direk ulasilir mi?
	//Hayýr
}
	public void staticOlmayanMethod() {
		// instance variable'lara staticOlmayanMethod methottan direk ulasilir
		//obje olusturarak
		
	}
	
	
}
