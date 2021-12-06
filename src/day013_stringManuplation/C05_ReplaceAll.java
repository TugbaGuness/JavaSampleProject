package day013_stringManuplation;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		String cumle="Java   cok       zevkli";
		cumle=cumle.replaceAll("\\s+", " ");
		System.out.println(cumle); //Java cok zevkli
		cumle=cumle.replaceAll("[ak]", "");
		System.out.println(cumle); // sadece ak arasi kalan tüm ak harflerini 
		//yok etti Jv co zevli
		
		System.out.println(cumle.replaceAll("\\S", "*"));//** ** *****
		System.out.println(cumle.replaceAll("\\s", "*"));//Jv*co*zevli
		cumle=cumle.replaceAll("[a-z]", "");	
		System.out.println(cumle); //J   adan zye tum harfleri yok etti
		/*
		\\s==> bosluk /Space
		\\S==> bosluk disi hersey
		\\w==> tum harfler ve rakamlar
		\\W==> harfler ve rakamlar disi hersey
		\\d==> Rakamlar
		\\D==>Rakamlar disi hersey
		\\S++==> Birden fazla bosluk varsa
		*/
		
		
      
	}

}
