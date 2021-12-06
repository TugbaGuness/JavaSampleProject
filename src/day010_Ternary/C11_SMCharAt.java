package day010_Ternary;

public class C11_SMCharAt {

	public static void main(String[] args) {
		// charAt (istenenIndex) method'u istedigimiz indexdeki
		//karakteri bize verir
		
		String kurs="Techproeducation";
		System.out.println(kurs.charAt(5)); //r
		
		//index 0'dan baslar
		
		System.out.println(kurs.charAt(0)); //T bize ilk harfi verir
		
		System.out.println(kurs.charAt(15)); //n son harf

	}

}
