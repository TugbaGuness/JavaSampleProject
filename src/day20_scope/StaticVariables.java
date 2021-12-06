package day20_scope;

public class StaticVariables {
	
	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean tatildeMi;
	static boolean aktifMi=true;
	
	

	public static void main(String[] args) {
		//static variable lara direk main methoddan ulasilir
		
		System.out.println(no); //20
		no++;
		System.out.println(no); //21
		
		staticMethod();
		System.out.println(no); //22
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println(no); //23
		
		
	}
			public static void staticMethod() {
				
		//static variable lara direk static methoddan ulasilir
				no++; //22
				//staticten son deger gecerli
			System.out.println("static methodda sayi:" +no);
			
		}
			public void staticOlmayanMethod() {
				//static variable lara direk static olmayan methoddan ulasilir
				//staticlere her yerden ulasilir, bu yuzden class variable denir
				no++; //23
				System.out.println(no);
				
			}
	}


