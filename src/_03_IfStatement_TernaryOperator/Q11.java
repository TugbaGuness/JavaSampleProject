package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /*  Problem Tanimi
        Kullanicidan bir tarihi gun, ay ve yil seklinde alip bu tarihi
        ay, gun, yil ve yil, ay, gun satiralarina cevirerek yazan bir kod yaziniz.
    	TRICK: her else komutundan sonra return; komutu kullaniniz...

        Ornek Ekran ciktisi
        Lutfen gunu giriniz: 10
        Lutfen ayi giriniz: 02
        Lutfen yili giriniz: 2009
        Gun ay yil: 10.02.2009
        Ay gun yil: 02.10.2009
        Yil ay gun: 2009.02.10
        */
         Scanner scan=new Scanner(System.in);
         System.out.println("Lutfen gunu giriniz");
         int gun=scan.nextInt();
         System.out.println("Lutfen ayi giriniz");
         int ay=scan.nextInt();
         System.out.println("Lutfen yili giriniz");
         int yil=scan.nextInt();
         System.out.println("Gun ay yil:" +gun +"."+"0"+ay +"." +yil);
         System.out.println("Ay gun yil:" +"0"+ay +"."+gun +"." +yil);
         System.out.println("Yil ay gun:" +yil +"."+"0"+ay +"." +gun);


    }
}
