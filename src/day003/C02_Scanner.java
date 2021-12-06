package day003;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		//kullanicidan ismini alip isminin bas harfini yazdirin

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Lutfen isminizi yaziniz");
	
	char ilkHarf= scan.next().charAt(0);
	
	//0 burda index isim olarak ne girilirse ilk harfini alir
	//Mehmet m index:0 e index:1 h index:3 m index:4 ...
	
	System.out.println("isminizin ilk harfi=" + ilkHarf);
	scan.close();
	
		
		
		
	}

}
