package Javapracticefull2021;

import java.util.Scanner;

public class C04_HalukB�lg�nHomeworks {

	public static void main(String[] args) {
		   /*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13  
        
            */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�lk birinci kenari giriniz");
		int birincikenar= scan.nextInt();
		System.out.println("�lk ikinci kenari giriniz");
		int ikincikenar=scan.nextInt();
		double hipotenus= Math.sqrt(birincikenar*birincikenar+ikincikenar*ikincikenar);		
		System.out.println("Bu ucgenin hipotenusu=" +hipotenus);
				
		
        /*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */
		System.out.println("Mesafeyi giriniz:");
		int mesafe= scan.nextInt();
		
		System.out.println("H�z� giriniz:");
        int hiz=scan.nextInt();
        int s�re=mesafe/hiz;
       
		System.out.println("S�re:"+s�re+ "saattir.");
		
		
		
		
		
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
		System.out.println("Lutfen kilonuzu giriniz");
		
		double kilo1= scan.nextDouble();
		
		System.out.println("Lutfen boyunuzu giriniz");
		
		double boy1= scan.nextDouble();
		
		double vucutKitleIndeksi= kilo1/(boy1*boy1);
		System.out.println("Vuc�t Kitle Indeksiniz=" +vucutKitleIndeksi);
			
		
        /*
    	 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		System.out.println("Vize1 Notunuz");
		double vize1= scan.nextDouble();
		
		System.out.println("Vize2 Notunuz");
		double vize2= scan.nextDouble();
		
		System.out.println("Final Notunuz");
		double final1= scan.nextDouble();
		
		
		System.out.println("Ge�me Notu=" +((vize1+vize2/2)*30+final1*70)/100);
		
		
		
      
	}

}
