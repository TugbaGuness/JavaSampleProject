package day010_Ternary;

public class C09_SwichCase {

	public static void main(String[] args) {
		// Harf olarak girilen notu rakama cevirin
		//			Not’u harf sistemine cevirip yazdirin.
		//			50’den kucukse “D”,
		//			50-60 arasi “C”,
		//			60-80 arasi “B”,
		//			80’nin uzerinde ise “A”

		char not='5';
		switch(not) {
		
		case'A':
			System.out.println("85-100 arasi");
			break;
		case'B':
			System.out.println("85-60 arasi");
			break;
		case'C':
			System.out.println("50-60 arasi");
			break;
		case'D':
			System.out.println("50'den dusuk");
			break;
			default:
			System.out.println("Gecersiz not");
			
			
		}
		
		
		
		
		
	}

}
