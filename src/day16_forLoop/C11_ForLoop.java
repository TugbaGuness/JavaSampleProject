package day16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C11_ForLoop {

	public static void main(String[] args) {
		//Kullanicidan 10’dan kucuk bir tamsayi isteyin 
		//ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.print(sayi +"!=");
		int faktoriyel=1;
		
		for (int i = sayi; i >0; i--) {
			faktoriyel*=i;
			System.out.print(i +"*");
			
		}
			System.out.println("=" +faktoriyel);
		}
		
		
	}


