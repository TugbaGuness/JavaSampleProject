package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// KullanÄ±cÄ±dan aldÄ±ÄŸÄ±nÄ±z koordinat noktasÄ±nÄ±n hangi bÃ¶lgede olduÄŸunu yazdÄ±ran bir kod yazÄ±nÄ±z.
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen x koordinatýndan bir sayi giriniz:");
    	double x=scan.nextDouble();
    	System.out.println(x);
    	
    	System.out.println("Lutfen y koordinatýndan bir sayi giriniz:");
    	double y=scan.nextDouble();
    	System.out.println(y);
    	
    	
    	if (x>=0 && y>=0) {
    		System.out.println("Birinci bölgede");
			
		} else if(x>=0 && y<=0) {
			System.out.println("Dorduncu bölgede");
			
		} else if(x<=0 && y>=0) {
			System.out.println("Ikýncý bölgede");
			
		} else if(x<=0 && y<=0) {
			System.out.println("Ucuncu bölgede");
		}else {
			
		}
    	
    	

       
    }
}
