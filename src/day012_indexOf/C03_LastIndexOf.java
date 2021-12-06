package day012_indexOf;




import java.util.Scanner;

public class C03_LastIndexOf {
	public static void main(String[] args) {
	// kullanidan bir cumle ve bir kelime isteyin
			//kelimenin cumledeki kullanimina bakarak asagidaki ýc cumleden uygun olani yazdirin
			//girilen kelime cumlede kullanilmamis
			//girilen kelime cumlede bir kere kullanilmis
			//girilen kelime cumlede birden fazla kullanilmis
			
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir cumle giriniz");
	String cumle=scan.nextLine();
	System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
	String kelime=scan.next();
	int index=cumle.lastIndexOf(kelime);
	if (index<0) {
		System.out.println("Girdiginiz kelime girilen cumlede yok");
	} else if(cumle.lastIndexOf(kelime, index-1)<0){
		System.out.println("Girdiginiz kelime cumlede bir kere kullanilmis");
	}else {
		System.out.println("Girdiginiz kelime cumlede birden fazla kullanilmis");
	
	}
			
		
	}
	}


