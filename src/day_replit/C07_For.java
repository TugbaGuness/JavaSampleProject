package day_replit;

import java.util.Scanner;

public class C07_For {

	public static void main(String[] args) {
		/*Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi bir say� M�kemmel Say� olarak bilinir.
Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int toplam=0;
		for (int i = sayi-1; i > 0; i--) {
			if (sayi%i==0) {
				System.out.print(i+" ");
		          toplam+=i;
				
				}
			if (sayi==toplam) {
				System.out.print("Mukemmel sayidir");
				
			}
			}
			if (sayi!=toplam) {
				System.out.print("Mukemmel sayi degildir");
			}
		}	

	}


