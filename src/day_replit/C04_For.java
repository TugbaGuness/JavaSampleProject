package day_replit;

public class C04_For {

	public static void main(String[] args) {
		// Girdi olarak bir tamsayý kabul eden ve 
		//faktöriyel hesaplayan programi yazýniz.
		int sayi=6;
		System.out.println(sayi +"!=");
		for (int i = sayi-1; i >0; i--) {
			
				sayi*=i;
				System.out.print(i+1);
			}
			
		System.out.println("*1=" +sayi);
		}
	
	}

/*System.out.print(sayi +"!=");
int faktoriyel=1;

for (int i = sayi; i >0; i--) {
	faktoriyel*=i;
	System.out.print(i +"*");
	
}
	System.out.println("=" +faktoriyel);
}
*/

