package day30_staticBlocks;

public class C01_StaticBlok {

	
		
		static {
			
			System.out.println("static blok ne zaman calýsacak");
			System.out.println("main methoddan bile once calisir");
			
		}
		
		public static void main(String[]args) {
			System.out.println("Javada once main method calisir");
			
		}
		
//birden fazla static method varsa java yukaridakini daha once calistirir
	}


