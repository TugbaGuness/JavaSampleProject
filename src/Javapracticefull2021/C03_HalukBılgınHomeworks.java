package Javapracticefull2021;

import java.util.Scanner;

public class C03_HalukB�lg�nHomeworks {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen uc basamakli sayi giriniz");
		int sayi=scan.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int y�zler=(sayi/100)%10;
        
        System.out.println("Girdiginiz say�n�n birler basamag�:"+birler+"\nGirdiginiz sayinin onlar basamag�:"+onlar+"\nGirdiginiz sayinin y�zler basamag�:"+y�zler);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        /*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
	}

}
