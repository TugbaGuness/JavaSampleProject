package day010_Ternary;

public class C05_Ternary {

	public static void main(String[] args) {
		// Eger cal�san kad�nsa 60 yas�ndan buyuk oldugunda emekli olabilir,
		// cal�san erkekse 65 yas�ndan buyukse emekl� olabilir.
		
		
		//her seferinde scanner olusturmak yerine test datalarimizi
		// variable olarak da olusturabiliriz
		// kod yazimi bittiginde bu test datalarini degistirerek
		//kodlarimizi test edebiliriz
		
		char cinsiyet ='E';
		int yas=66;
		String sonuc= cinsiyet == 'K' ? (yas>60 ? "Emekli olabilirsin" : "Emekli olmazsin"):
			                            (yas>65 ? "Emekli olabilirsin" : "Emekli olmazsin");
		System.out.println(sonuc);
         
			
	}

}
