package day_replit;

public class C05_For {

	public static void main(String[] args) {
		// 100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.

        //OUTPUT : 100 98 96 94 92 � � � � 2 0
		
		
		int sayi=100;
	
			for (int i =sayi; i>0; i--) {
				if (i%2==0) {
					System.out.print(i+" ");
					
				}
				
			}
			
		}
		
	}


