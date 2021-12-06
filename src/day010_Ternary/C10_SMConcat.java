package day010_Ternary;

public class C10_SMConcat {

	public static void main(String[] args) {
		//String olarak verilen bir degisken + ile
		// baska bir degiskenle isleme sokulursa Java bunlari
		// yanyana ekler buna concatenation denir
		
		String isim="Ali";
		String soyisim="Can";
		System.out.println(isim+" " + soyisim);//Ali Can
		
		//ayni islemi concat() ile de yapabiliriz
		
		System.out.println(isim.concat (" ").concat(soyisim));
		
		

	}

}
