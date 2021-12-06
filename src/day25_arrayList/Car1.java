package day25_arrayList;

		
		public class Car1 {
	
			public int yil=2000;
			public String renk;
			public String model;
			public int km;
			public boolean satilikMi;
		    
		    public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
				//atama yapacagimiz tum ozellikleri parametre olarak yolladik
			}

			public Car1() {
				// TODO Auto-generated constructor stub
			}

			public Car1(int i) {
				// km int lar farkli scopelardadir senin olusturdugun km ile benim i aynidir demek lazim
				km=i; // soru  ortadan kalkar
			}

			public Car1(int i, int j) {
				// TODO Auto-generated constructor stub
				
				yil=i;
				km=j;
				
			}

			public void hiz(int hiz) {
		        System.out.println("araba saatte " + hiz + " km yapar");
		    }
		    
		    public void yakit(String yakit) {
		        System.out.println("Araba yakit olarak " + yakit + " kullanir");
		 
		 

	}

}
