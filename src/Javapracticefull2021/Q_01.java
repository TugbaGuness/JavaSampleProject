package Javapracticefull2021;

public class Q_01 {

	public static void main(String[] args) {
		//12345 sayýsýný yukaridan asagiya dogru yazdirin
		
		//output: asagýya dogru yazdýr
		// verilen 12345 sayýsýnýn rakamlarýný yukarýdan aþaðýya doðru yazdýrýnýz
		// ex: input: 12345
//		  output: 1
//		      2
//		      3
//		      4
//		      5
		
		int sayi=12345;
		int birler= sayi%10;
		
		int onlar= (sayi/10)%10;
		int yuzler= (sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000);
		
		System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		
		//tek satýrda yazdirabilmek icin
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
		
		
		   
		        
		        
		        
		       
		

	}

}
