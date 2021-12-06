package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// verilen iki sayilari toplayan method
		
		int a=10;
		int b=20;
		int c=30;
		int d=5;
		topla(a,b);
		topla(a,b,c);
		topla(a,b,c,d);
		//sayilar arttikca parametre ekleme yada method ekleme yerine
		//Varargs tek yontemle ýstedgýmýz kadar sayi toplar

	}

	private static void topla(int...a) {
		System.out.println("varargs calisir: " );
		//bu method ile kac sayi eklersek ekleyelim topla methodu uayri vermez calisir
		
	}

	private static void topla(int a, int b) {
		System.out.println("iki sayinin toplami:" + (a+b));
		//iki sayinin toplami:30
	}

}
