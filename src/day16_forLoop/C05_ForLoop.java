package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		//Emine CEYRAN  8:48 PM
        //meshur seher haným
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk sayi giriniz");
		int sayi=scan.nextInt();
		
		
		
		

		
		for (int i = 1; i <= sayi; i++) {
			
			
			if (i%3==0 || i%5==0) {
				System.out.print(i+" ");
				
			}
			
scan.close();
	}

}
}
