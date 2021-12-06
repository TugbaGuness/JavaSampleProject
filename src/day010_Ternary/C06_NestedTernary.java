package day010_Ternary;

public class C06_NestedTernary {

	public static void main(String[] args) {
		        //Kullanicidan bir harf isteyin
				// kucuk harf ise consola “Kucuk Harf” ,
				// buyuk harfse consola “Buyuk Harf”
				// yoksa “girdiginiz karakter harf degil” yazdirin.
				
				char krk='0';
				String sonuc=(krk>='a' && krk<='z') ? "Kucuk harf" : 
					(krk>='A' && krk<='Z')  ? "Buyuk harf" : "Girilen karakter harf degil";
                 System.out.println(sonuc);
	}

}
