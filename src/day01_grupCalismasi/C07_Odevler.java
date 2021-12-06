package day01_grupCalismasi;

import java.util.Scanner;

public class C07_Odevler {

	private static final String str = null;




	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kelime giriniz");
		String str=scan.next().toLowerCase();
		
		String birlesmisIsim= null;
		degisim(str);
		degisim2(str);
		
		System.out.println(str);
     if (str.startsWith("g")){
    	 birlesmisIsim= degisim(str);
        System.out.println(str.substring(0,1)+str.substring(2,str.length()));
    }else if (str.charAt(1)=='h'){
    	birlesmisIsim= degisim(str);
        System.out.println(str.substring(1));
    }else {
    	birlesmisIsim= degisim2(str);
        System.out.println(str.substring(2));
    }
			
	}
	
		
	

	private static String degisim2(String str) {
		
		String birlesmisIsim=(str.substring(2));
		
	
		

		return birlesmisIsim; 
		
	}




	private static String degisim(String str) {
		String birlesmisIsim=str.substring(0,1)+str.substring(2);
		
		
		return birlesmisIsim; 
		
	}

}
