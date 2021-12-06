package day05_wrapper_concatenaion;

public class C1_wrapperclass {

	public static void main(String[] args) {
	
		 String isim= "Mehmet";
		 int sayi=10;
		 System.out.println(isim.charAt(2));
		 
//isim. dedigimizde bircok method siralaniyor cunku isim data methodu string ve non-primitive
		 //non-primitive yaninda bircok methodlar vardir
		 
		 //primitive data turlerinde sadece value'ya sahiptir methodlari yoktur
		 //Java primitivelerinde method olarak kullanilmasi icin her primitive data turu icin Wrapper class olusturmustur
		 
		 Integer sayi2=10;
		 System.out.println(sayi2.MAX_VALUE);// int. alabilecegi max deger
		 System.out.println(sayi2.MIN_VALUE);// int. alabilecegi min deger
		 
		 //shortun min ve max degeri
		 Short sayi3=10;
		 System.out.println(sayi3.MAX_VALUE);
		 System.out.println(Short.MIN_VALUE);
		 
		 
		 String okulNo="858";
		 int okulNoSayiOlarak = Integer.parseInt(okulNo);
		 System.out.println(++okulNoSayiOlarak); //okul numarasi bir artirildi
		 Character basHarf='a'; //char
		 System.out.println(basHarf.charValue());//a
		 System.out.println(Character.toUpperCase('a'));
		 
	
	}

}
