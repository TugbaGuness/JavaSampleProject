package day_replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class C03_For {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.nextLine();
		List<String> list =new ArrayList<>();
		
		for (int i = 0; i < kelime.length(); i++) {
			int sayac=0;
			
			for (int j = i+1; j <kelime.length() ; j++) {
				if (kelime.charAt(i)==kelime.charAt(j)) {
					sayac++;
					
				} 
				
				
			}
			if (sayac>1 && !list.contains(kelime.substring(i))) {
				list.add(kelime.substring(i,i+1));
				
			
			}
			
		}
			
		System.out.println(list);
		for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i) +" ");
				
			}
			
		}
			
		

		

	}




