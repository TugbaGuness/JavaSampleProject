package day28_constructor;

public class C02 {
	
	int x=5;
	static int y=10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		C02 obje1= new C02();
		System.out.println("obje1 için x :" +obje1.x +"y icin :" +obje1.y);
        //obje1 için x :5y icin :10
		obje1.x++;
		obje1.y++;
		System.out.println("obje1 için x :" +obje1.x +"y icin :" +obje1.y);
		
		C02 obje2= new C02(); // sifirdan ayni degerleri alir fakat y icin static son deger alir
		System.out.println("obje2 için x :" +obje2.x +"y icin :" +obje2.y);
		//obje2 için x :5y icin :11
		obje2.x++;
		obje2.y++;
		
		System.out.println("obje1 için x :" +obje1.x +"y icin :" +obje1.y);
		//obje1 için x :6y icin :12
		
		C02 obje3= new C02(); 
		obje3.x=20;
		obje3.y=40;
		System.out.println("obje3 için x :" +obje3.x +"y icin :" +obje3.y); //obje3 için x :20y icin :40
		
		
	}

}
