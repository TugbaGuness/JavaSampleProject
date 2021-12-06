package day003;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		//eger buyuk data turundeki bir veriyi daha kucuk data 
		//turundeki variable atarsak java bunu otoatik yapmaz
		
		int sayi1=260;
		short sayi2= (short) sayi1;
		//esitligin sagi ile solundaki veri turleri farkli oldugundan
		//java mismacth hatasi verir
		//hatayi gidermek icin buyuk data turundeki degerin onune manuel 
		//onayinizi gosteren short yazilir
        System.out.println("sayi2="  + sayi2);
        
        byte sayi3= (byte) sayi2;
        
        System.out.println("sayi3="  + sayi3);
         double sayi4= 87.3;
         int sayi5= (int) sayi4;
         
         System.out.println("sayi5="  + sayi5);
         
         int sayi6= 27;
         int sayi7=4;
         System.out.println(sayi6/sayi7);
         double sayi8=4;
         System.out.println(sayi6/sayi8);
         
         //double buyuk oldugundan double a gore ceviriyor
         
         double sayi9=17;
         System.out.println(sayi9/sayi7);
         //double bolu ınt bile olsa buyuk olani aliyor
         
	}

}
