package Javapracticefull2021;

import java.util.Scanner;

public class C04_HalukBýlgýnHomeworks {

	public static void main(String[] args) {
		   /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13  
        
            */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ýlk birinci kenari giriniz");
		int birincikenar= scan.nextInt();
		System.out.println("Ýlk ikinci kenari giriniz");
		int ikincikenar=scan.nextInt();
		double hipotenus= Math.sqrt(birincikenar*birincikenar+ikincikenar*ikincikenar);		
		System.out.println("Bu ucgenin hipotenusu=" +hipotenus);
				
		
        /*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.
     */
		System.out.println("Mesafeyi giriniz:");
		int mesafe= scan.nextInt();
		
		System.out.println("Hýzý giriniz:");
        int hiz=scan.nextInt();
        int süre=mesafe/hiz;
       
		System.out.println("Süre:"+süre+ "saattir.");
		
		
		
		
		
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
		System.out.println("Vucüt Kitle Indeksiniz=" +vucutKitleIndeksi);
			
		
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
		
		
		System.out.println("Geçme Notu=" +((vize1+vize2/2)*30+final1*70)/100);
		
		
		
      
	}

}
