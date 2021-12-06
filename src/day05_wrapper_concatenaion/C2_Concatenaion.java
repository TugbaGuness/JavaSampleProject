package day05_wrapper_concatenaion;

public class C2_Concatenaion {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4;
	//Hello1 yazdirin
		System.out.println(str1 + (sayi2-sayi1));
		// Hello 5 World yazdirin
		
		System.out.println(str1+" " + ++sayi2 +" " +str2);
//Hello 34 yazdirin
		System.out.println(str1+" "+sayi1+--sayi2);
		//7World yazdirin
		System.out.println(sayi1+sayi2+str2);
		//34
		System.out.println(sayi1+""+sayi2); //string olmasý icin araya cift tirnak konulmali
		
		//Ýnt'i stringe cevirmek icin method'a ihtiyac var yok
		String intdanCevrilen = ""+sayi1; //method kullanmadan cift tirnak int i stringe cevirir 
	}

}
