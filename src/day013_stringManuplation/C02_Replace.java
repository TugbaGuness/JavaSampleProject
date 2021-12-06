package day013_stringManuplation;

public class C02_Replace {

	public static void main(String[] args) {
		//String olarak verilen 10.000 sayisinin
		//binden buyuk olmadigini yazdirin
		
		String sonuc="10.000";
		sonuc=sonuc.replace(".", ""); //. yok edip 10000 yapti
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("bulunan sonuc sayisi 1000'den cok");
		} else {
			System.out.println("bulunan sonuc sayisi 1000'den az");
		}

	}

}
