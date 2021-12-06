package day010_Ternary;

public class C07_Switchcase {

	public static void main(String[] args) {
		//gun numarasina gore gun isimlerini yazdiralim
		
		int gunNo=10;
		
		switch(gunNo) {
		
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
		default:
			System.out.println("lutfen gecerli bir gun giriniz");
			

			
		}

	}

}
