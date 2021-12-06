package day013_stringManuplation;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlari kullanarak Java ogrenmek cok kolaya getircem
		
		str=str.replaceAll("\\d",""); 
		System.out.println(str); //*Java ogrenmek c..ok kolay rakamlar gitti
		str=str.replaceAll("\\s", "x");
		System.out.println(str);
		str=str.replaceAll("\\W", "");//Javaxogrenmekxcokxkolay
		System.out.println(str);
		str=str.replaceAll("x", " ");//Java ogrenmek cok kolay
		System.out.println(str);
		str=str.replaceAll("\\w", "");
		System.out.println(str); //*  ..  harflerin hepsini sildi
		
		//regular expression java ya gir
	}
	

}
