package day01_grupCalismasi;

import java.util.Scanner;

public class C06_Odevler {

	public static void main(String[] args) {
		 
		/*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluÅŸturun
                  e.g:
                 name1= mehmet
                 name2= ahmet
                 Print ==> mehahmetmet
        */
		Scanner scan=new Scanner(System.in);
		String name1= scan.next().toLowerCase();
		String name2= scan.next().toLowerCase();
		
		
		if (name1.length()%2==0) {
            System.out.println("Ýlk isminin ilkyarisina ikinci ismin eklenmiþ hali:" +name1.substring(0,name1.length()/2)+ name2 +name1.substring(name1.length()/2)); 
            
            	
		} else {
			System.out.println("Ýlk isim cift sayili olmadigi icin ortasina yerlestiremedik");
		}
		
		
		



	
		
	}

}

	