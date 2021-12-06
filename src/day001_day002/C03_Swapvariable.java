package day001_day002;

public class C03_Swapvariable {

	public static void main(String[] args) {
		// verilen sayi1 ve sayi2 variablelarýný 3. degisken olmadan 
		int sayi1= 15;
		int sayi2= 20;
		
		System.out.println("baslangicta sayi1= " + sayi1 + " ve sayi2=" + sayi2);
		
		//ucuncu variable kullanmayacaksak verilen iki sayinin farkindan istifa edilir
		// ilk adim olarak sayilarin farkini ilk sayiya assign ediyorum
		sayi1= sayi1-sayi2; // sayi1= -5
		// ikinici adim fark ile sayi2 yi toplayip sayi2 ye assign ediyorum
		
		sayi2= sayi1+sayi2; // sayi2=15
		// ucuncu adim olarak sayi1 e sayi2 - fark atayalim
		sayi1= sayi2-sayi1; // 15--5= 20
		System.out.println("sonucta sayi1= " + sayi1 + " ve sayi2=" + sayi2);
		
		
		

	}

}
