package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen x koordinat�ndan bir sayi giriniz:");
    	double x=scan.nextDouble();
    	System.out.println(x);
    	
    	System.out.println("Lutfen y koordinat�ndan bir sayi giriniz:");
    	double y=scan.nextDouble();
    	System.out.println(y);
    	
    	
    	if (x>=0 && y>=0) {
    		System.out.println("Birinci b�lgede");
			
		} else if(x>=0 && y<=0) {
			System.out.println("Dorduncu b�lgede");
			
		} else if(x<=0 && y>=0) {
			System.out.println("Ik�nc� b�lgede");
			
		} else if(x<=0 && y<=0) {
			System.out.println("Ucuncu b�lgede");
		}else {
			
		}
    	
    	

       
    }
}
