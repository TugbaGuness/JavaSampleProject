package day011_stringManupilation;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		System.out.println(str4); //ali can
		System.out.println(str4==str3); //false
		System.out.println(str3.equals(str4)); //false cunku degerler farkli
		System.out.println(str3.equalsIgnoreCase(str4)); //case i true laaa true gelir kucuk buyuk harfleri esas almaz
		//sensitive olmadan esas alir
		String isim="Ali Can";
		System.out.println(isim.length()); //7 uzunluk
		String isim1="";
		System.out.println(isim1.length()); //0
		String isim2=" ";
		System.out.println(isim2.length()); //1
		
		System.out.println(isim.charAt(isim.length()-1)); //son harf indexini verir n
		String isim3=null; //null hic bir deger atanmamis
		//System.out.println(isim3.length()); //uzunluk icin hata verir
		System.out.println(isim3); //null
		
		String isim4;
		//System.out.println(isim4); //hicbir deger atamaz isen hata verir
		
		String isim5="Ali Can";
		System.out.println(isim5.indexOf('A')); //0 girilen bir char veya stringin ilk indexini verir
		System.out.println(isim5.indexOf('l')); //1
		System.out.println(isim5.indexOf("Ali")); //0
		System.out.println(isim5.indexOf('K')); //-1 false cevap vermedigi icin 
		int index=str1.indexOf("a"); //rakam verdigi icin int olmali diger variable lari kabul etmez
		
		
		
	}

}
