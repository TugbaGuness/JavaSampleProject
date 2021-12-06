package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugune gore 100 gun sonra hangi gun oldugunu yazdiracaksiniz.
        // pazartesi haftanin ilk gunu olarak aliniz..
    	System.out.println("Bugunu haftanin 7 gününden hangi rakama ait oldugunu giriniz");
    	System.out.println("Pazartesi haftanin ilk gunudur");
    	int gun=3+(100/7)/7;
    	
    	switch (gun){
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
        
    }
    }
}

