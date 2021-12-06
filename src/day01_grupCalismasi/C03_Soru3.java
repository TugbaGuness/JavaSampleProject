package day01_grupCalismasi;

import java.util.Scanner;

public class C03_Soru3 {

	public static void main(String[] args) {
		/*  Problem Tanimi
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)

        Ornek Ekran ciktisi
        birinci kenari giriniz: 2
        ikinci kenari giriniz: 15
        ucuncu kenari giriniz: 7
        Bu bir dik ucgen degildir.

        Bu bir dik ucgendir
        
     */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen birinci kenari giriniz");
		int birinciKenar= scan.nextInt();
		System.out.println("Lutfen ikinci kenari giriniz");
		int ikinciKenar= scan.nextInt();
		System.out.println("Lutfen ucuncu kenari giriniz");
		int ucuncuKenar= scan.nextInt();
		if (birinciKenar*birinciKenar+ikinciKenar*ikinciKenar==ucuncuKenar*ucuncuKenar) {
			System.out.println("Bu bir dik ucgendir");
			
		}else {
			System.out.println("Bu bir dik ucgen degildir");
		}
		
		
		
		
		
		
		
		
		
		
    	/*Scanner scan=new Scanner(System.in);
    	System.out.println("Lutfen uc adet sayi giriniz:");
    	System.out.println("birinci kenari giriniz:");
    	int birinciKenar= scan.nextInt();
    	System.out.println("ikinci kenari giriniz:");
    	int ikinciKenar= scan.nextInt();
    	System.out.println("ucuncu kenari giriniz:");
    	int ucuncuKenar= scan.nextInt();
    	
    	if (birinciKenar*birinciKenar+ikinciKenar*ikinciKenar==ucuncuKenar*ucuncuKenar) {
    		System.out.println("Bu bir dik ucgendir");
			
		} else {
			System.out.println(" Bu bir dik ucgen degildir.");

		}

         */
	}

}
