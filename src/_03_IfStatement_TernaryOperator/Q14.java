package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {  
	public static void main(String[] args) {
	/* Günün sorusu: if statement
      katsayilari verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

       Cözüm adimlari
        kullanicidan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kok vardir x1=(-b + kok(d)) / (2a)  , x2= (-b - kok(d)) / (2*a)
        Delta = 0 => 1 tane kok vardir x = -b/2a
        Delta < 0 ise kok yoktur.
   */
    
          Scanner scan=new Scanner(System.in);
          System.out.println("a rakamini giriniz");
          int a=scan.nextInt();
          System.out.println("b rakamini giriniz");
          int b=scan.nextInt();
          System.out.println("c rakamini giriniz");
          int c=scan.nextInt();
         
          int delta=(b*b)-4*(a*c);
          if (delta>0) {
        	  System.out.println("x1:" +((-1)*b + c)/2*a);
        	  System.out.println("x2:" +((-1)*b - c)/2*a);
			
		} else if(delta==0){
			 System.out.println("x:" +(-1)*b /(2*a));
		

		}else {
			System.out.println("Kok yoktur");
		}

		}
          
          
          
  
}
