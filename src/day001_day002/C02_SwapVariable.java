package day001_day002;

public class C02_SwapVariable {

	public static void main(String[] args) {
		/*
		 Verilen sayi1 ve sayi2 variable larinin degerlerini swap bir program yaziniz
		 öncesinde sayi1=10 ve sayi2=20  kod calýsýnca sayi1=20 ve sayi2=10 yazacak
	
		 */
		
		int sayi1= 10;
		int sayi2= 20;
		
		System.out.println("baslangicta sayi1= " + sayi1 + " ve sayi2=" + sayi2);
		// bos bir variable olustur
		
		int bos;
		
		//sayi2 yi bos variable a ata
		
		bos= sayi2;
		// sayi2 kovasina sayi1 degerini ata
		 sayi2= sayi1;
		 
		 //bos kovadakini sayi1 e ata
		 sayi1= bos;
		 
		 System.out.println("sonucta sayi1= " + sayi1 + " ve sayi2= " + sayi2);
		 
		 


		

	}

	}



		 

	


