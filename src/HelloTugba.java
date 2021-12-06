import java.util.Scanner;
public class HelloTugba {
	public static void main(String[] args) {

	
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yili giriniz");
		int yýl=scan.nextInt();
		System.out.println("Lutfen gireceginiz ayi numerik giriniz");
		int ay=scan.nextInt();
		

	
		
		switch (ay) {
		
		case 1:
			System.out.println("Ocak " +yýl +" 31 Gundur.");
			break;
		case 2:
			
			if (yýl%4==0) {
				
				System.out.println("Subat " +yýl +" 29 Gundur.");	
			} else {
			
				System.out.println("Subat " +yýl +" 28 Gundur.");

			}
			break;
		case 3:
			System.out.println("Mart " +yýl +" 31 Gundur.");
			break;
		case 4:
			System.out.println("Nisan " +yýl +" 30 Gundur.");
			break;
		case 5:
			System.out.println("Mayis " +yýl +" 31 Gundur.");
			break;
		case 6:
			System.out.println("Haziran " +yýl +" 30 Gundur.");
			break;
		case 7:
			System.out.println("Temmuz " +yýl +" 31 Gundur.");
			break;
		case 8:
			System.out.println("Agustos " +yýl +" 31 Gundur.");
			break;
		case 9:
			System.out.println("Eylul " +yýl +" 30 Gundur.");
			break;
		case 10:
			System.out.println("Ekim " +yýl +" 31 Gundur.");
			break;
		case 11:
			System.out.println("Kasim " +yýl +" 31 Gundur.");
			break;
		case 12:
			System.out.println("Aralik " +yýl +" 30 Gundur.");
			break;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}