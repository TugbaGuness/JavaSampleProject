package day15_MethodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		
		//Javada ayni isimde birden fazla method olur mu?
		//evet olur.
		//Ayni isimde birden fazla method olursa java hangisini calistiracagina
		//nasil karar verir?
		//isim ayni olan methodlarda parametre sayisina bakar
		//sonra da parametre sayisi ile argumsan sayisi esit olanlardan
		//arguman data turleri ile parametre data turleri arasindan uyuma bakar
		//tamamen uyusan varsa onu kullanir
		//tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir
		//birden fazla secenek oldugunda java her zaman en optimum olani tercih eder
		topla(2,4);
		

		

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dort sayinin toplami:" +(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami:" +(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("Ýki sayinin toplami:" +(sayi1+sayi2));
	
	}

	private static void topla(int sayi1, int sayi2) {
		System.out.println("Ýki sayinin toplami:" +(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, int sayi2) {
		System.out.println("Ýki sayinin toplami:" +(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, double sayi2) {
		System.out.println("Ýki sayinin toplami:" +(sayi1+sayi2));
		
	}
}
