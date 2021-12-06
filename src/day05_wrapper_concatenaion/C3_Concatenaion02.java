package day05_wrapper_concatenaion;

public class C3_Concatenaion02 {

	public static void main(String[] args) {
		
		int sayi=7;
		char ilkharf='a';
		String str="Java";
		System.out.println(sayi+str+ilkharf); //7Javaa
		System.out.println(sayi+ilkharf+str); //asciii degeri ilþkharf 97 oluyor //104Java char degisken 
		//matematiksel islemde kullanilirsa ascii degeri toplanir
		
		//7a yazdirin
		System.out.println(""+sayi+ilkharf);

	}

}
