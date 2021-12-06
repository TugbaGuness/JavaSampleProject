package day16_forLoop;

import java.util.Iterator;

public class C12_NestedForLoop {

	public static void main(String[] args) {
		// 1 den 4 e kadar sayilari yanyana aralarinda bir
		//bosluk birakarak yazdirin
		
	
			
		for (int satir = 1; satir <=4; satir++) { //outher for loop
			
			for (int i = 1; i <=4; i++) { //inner for loop
				System.out.print(satir*i + " ");
				
			}
System.out.println(""); //alt satira gecmesi icin
			
		}
	}

}
