import java.util.Scanner;
public class HelloTugba {
	public static void main(String[] args) {

	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yili giriniz");
		int y�l=scan.nextInt();
		System.out.println("Lutfen gireceginiz ayi numerik giriniz");
		int ay=scan.nextInt();
		

	
		
		switch (ay) {
		
		case 1:
			System.out.println("Ocak " +y�l +" 31 Gundur.");
			break;
		case 2:
			
			if (y�l%4==0) {
				
				System.out.println("Subat " +y�l +" 29 Gundur.");	
			} else {
			
				System.out.println("Subat " +y�l +" 28 Gundur.");

			}
			break;
		case 3:
			System.out.println("Mart " +y�l +" 31 Gundur.");
			break;
		case 4:
			System.out.println("Nisan " +y�l +" 30 Gundur.");
			break;
		case 5:
			System.out.println("Mayis " +y�l +" 31 Gundur.");
			break;
		case 6:
			System.out.println("Haziran " +y�l +" 30 Gundur.");
			break;
		case 7:
			System.out.println("Temmuz " +y�l +" 31 Gundur.");
			break;
		case 8:
			System.out.println("Agustos " +y�l +" 31 Gundur.");
			break;
		case 9:
			System.out.println("Eylul " +y�l +" 30 Gundur.");
			break;
		case 10:
			System.out.println("Ekim " +y�l +" 31 Gundur.");
			break;
		case 11:
			System.out.println("Kasim " +y�l +" 31 Gundur.");
			break;
		case 12:
			System.out.println("Aralik " +y�l +" 30 Gundur.");
			break;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}