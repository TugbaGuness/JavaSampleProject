package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan= new Scanner(System.in);
    	System.out.println("Lutfen bir sayi giriniz");
    	double sayi=scan.nextDouble();
    	String result=(sayi>=0) ? (sayi<10) ? ("Rakam") : ("Pozitif sayi") : ("Negatif sayi");
        System.out.println(result);
        
        System.out.println((sayi>=0) ? ((sayi<10) ? ("rakam") : ("pozitif sayi")) : ("negatif sayi"));
        // if cozumu
        
        if (sayi>=0) {
        	if(sayi<10) {
			System.out.println("Rakam");
		} else {
			System.out.println("Pozitif sayi");
		}
    }else {
    	System.out.println("Negatif sayi");
    }
    }
}
