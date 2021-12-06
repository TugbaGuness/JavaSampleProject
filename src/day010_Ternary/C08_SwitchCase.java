package day010_Ternary;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore haftaici veya haftasonu yazdirsin
		
		int gun=5;
		switch(gun) {
		
		case 1:	
		case 2:	
		case 3:	
		case 4:	
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:	
		case 7:
			System.out.println("Hafta sonu");
			break;
			default:
			System.out.println("lutfen gecerli bir gun giriniz");
			

			}
	}

}
