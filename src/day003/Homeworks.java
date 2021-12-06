package day003;

public class Homeworks {

	public static void main(String[] args) {
		
		 //byte veri tipinde bir degisken olusturun
		//short int double float data tipinde bir degisken 
		// olusturup adim adim widening yapin yazdirin


		        byte sayi1=15;
		        short sayi2=sayi1;
		        
		        System.out.println("sayi2 : " +sayi2); // 15
		        
		        int sayi3=sayi2;
		        
		        System.out.println("sayi3 : "+sayi3); // 15
		        
		        float sayi4=sayi3;
		        
		        System.out.println("sayi4 : "+sayi4); // 15.0
		        
		        double sayi5=sayi4;
		        
		        System.out.println("sayi5 : "+sayi5); //15.0
		        
		        //  int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		        
		        int sayi6=20;
		        
		        short sayi7=(short)sayi6;
		        
		        System.out.println("sayi7: "+sayi7); // 20
		        
		        byte sayi8=(byte)sayi7;
		        
		        System.out.println("sayi8: " +sayi8); //20
		        
		        //  Float data turunde bir variable olusturun ve yazdirin
		        
		        float sayi9=38.7f;
		        
		        System.out.println("sayi9 : "+sayi9); // 38.7
		        
		        // double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip 
		        // yazdirin
		        
		        double num1=121.11;
		        
		        int num2=(int)num1;
		        
		        System.out.println("num2 : "+num2); // 121
		        
		        byte num3=(byte)num2;
		        
		        System.out.println("num3 . "+num3); // 121
		        
		        // int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		        
		        int a=29;
		        int b=17;
		        
		        System.out.println("Bolme sonucu : "+(a/b)); //1
		        
		        //  int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		        
		        int c=100;
		        double d=7.5;
		        
		        System.out.println("Bolum : "+(c/d)); // 13.3333333333
		        
		        // Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		        
		        char sayi10='8';
		        char harf='T'; // ascii 124
		        byte num4=7;
		        short num5=10;
		        int num6=70;
		        long num7=35;
		        float num8=35.7f;
		        double num9=88.9;
		        
		        System.out.println("Carpým : "+(sayi10*num6*harf*num5)); 
		        System.out.println("Bulme : "+(num9/harf+num8/num4)); //6.158333237965902
		        System.out.println("Toplama : "+(num7+num9)); //123.9
		        System.out.println("Cýkarma : "+(num9-num8)); //53.19999923706055
		        System.out.println("DortIslem : "+(num7*num6-num8*num9+num4*num5-harf/sayi10)); //-654.7300678253177
		        

	}

}
