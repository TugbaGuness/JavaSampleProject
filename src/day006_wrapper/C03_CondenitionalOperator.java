package day006_wrapper;

public class C03_CondenitionalOperator {

	public static void main(String[] args) {

		
		System.out.println(5+3==8 || 6+5==10 || 7-2==3);
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c;
		System.out.println(sonuc);

		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		System.out.println(5+3==8 & 6+5==10 & 7-2==3);

		//&& yerine & yaziladabilir
		// && isareti ilk false u buldugunda bu islemin false olacagini bilir
		//sonucu false yazdirir
		//& isaareti ise once tum islemleri bitirir sonra sonucu false yazdirir
		
	}

}
