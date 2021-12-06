package day003;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		//kullanicidan yaricap isteyin 
		//cemberin cevresini ve alanini hesaplayin
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen cemberin yaricapini giriniz");
		double yaricap= scan.nextDouble();
		double cevre= 2*3.14*yaricap;
		double alan= 3.14*yaricap*yaricap;
		//cemberin cevresi: 25.7
		//dairenin alani: 26.32
		// sabit kýsým ve degerler
		System.out.println("cemberin cevresi=" + cevre);
		System.out.println("dairenin alani="  + alan);
		scan.close();

	}

}
