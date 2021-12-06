package day008_IfElseStatement;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		// Eger calýsan kadýnsa 60 yasýndan buyuk oldugunda emekli olabilir,
		// calýsan erkekse 65 yasýndan buyukse emeklý olabilir.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, Kadin icin K");
	    char cinsiyet=scan.next().toUpperCase().charAt(0);
	    
	    System.out.println("Lutfen yasinizi giriniz");
	    double yas=scan.nextDouble();
	    if (cinsiyet=='E') {
			if (yas>=65) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin");
			}
		} else if(cinsiyet=='K'){
if (yas>=60) {
	System.out.println("Emekli olabilirsin");
} else {
	System.out.println("Emekli olamazsin");
}
		}else {
			System.out.println("Lutfen cinsiyet icin gecerli harf secin");
		}
	
	}
	

}
