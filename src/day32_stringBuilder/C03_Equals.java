package day32_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder ("Java");
		StringBuilder sb2= new StringBuilder ("Java");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		//string deki mantýkkla calismaz == mantýk ile calisir
		System.out.println(sb1.compareTo(sb2));//0
		//ilk harften baslayarak birebir stringbuilderlari karsilastirir
		//eger tum karakterler ayni ise sonuc olarak 0 doner
		//farkli karakter bulursa aradaki sb1 e gore farki alir
		//sonuc 0 ise esittir
		
		String str="Java";
		//System.out.println(sb1==str);// kýrmzýý oldu karsýlastýrma olmaz dýyor
		System.out.println(sb1.equals(str)); //false cunku karsilastiralamaz
		//compare to da kabul etmez
	}

}
