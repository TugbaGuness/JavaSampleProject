package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanicidan 5 adet sayi isteyiniz
        // Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulunuz.
        // bu soruyu continue kullanarak cozunuz
    	
    	 Scanner scan=new Scanner(System.in);
    	 
    	 int toplam=0;
    	 
    	 for (int i = 1; i <=5; i++) {
    		 System.out.println("Sayi " + i + " giriniz");
    		 int sayi=scan.nextInt();
    		 if (sayi>5 && sayi<10) {
				System.out.println("girilen sayi 5 ile 10 arasi oldu isleme alinmadi");
			continue;//yok saymak pas gecmek gibi birsey
    		 } 
           toplam += sayi;
			}
			System.out.println("Girdiginiz sayilarin toplami:" +toplam);
		}


}
        
    


