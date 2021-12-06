package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak 
		//girilen sayiya kadar 3’un kati olan sayilari yazdirin.
// negatif ve tam sayi degilse uyari
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk sayi giriniz");
		double sayi=scan.nextDouble();
		int sayi1=(int) sayi;
		
		
		
		
if (sayi1<0) {
			System.out.println("Negatif giremezsiniz");
			
		} else if(sayi1!=sayi){
			System.out.println("Tam sayi giriniz");

		}else if(sayi1>100){
			System.out.println("100'den kucuk giriniz");
			
		}
		
		for (int i = 1; i <= sayi1; i++) {
			
			
			if (i%3==0) {
				System.out.print(i+" ");
				
			}
			
		}
	}

}
