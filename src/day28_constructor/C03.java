package day28_constructor;

public class C03 {

	public static void main(String[] args) {
//Java runtime bir programdir run tusuna bastigimizde islemleri yapar javanin 
		//isi bittiginde hersey bitmis olur
		//objeleri silip C02 yazabilriz obje yazmaya gerek yok
		C02 obje1= new C02();
		System.out.println("obje1 i�in x :" +obje1.x +"y icin :" +obje1.y);
        //obje1 i�in x :5y icin :10
		obje1.x++;
		obje1.y++;
		System.out.println("obje1 i�in x :" +obje1.x +"y icin :" +obje1.y);
		
		C02 obje2= new C02(); // sifirdan ayni degerleri alir fakat y icin static son deger alir
		System.out.println("obje2 i�in x :" +obje2.x +"y icin :" +obje2.y);
		//obje2 i�in x :5y icin :11
		obje2.x++;
		obje2.y++;
		
		System.out.println("obje1 i�in x :" +obje1.x +"y icin :" +obje1.y);
		//obje1 i�in x :6y icin :12
		
		C02 obje3= new C02(); 
		obje3.x=20;
		obje3.y=40;
		System.out.println("obje3 i�in x :" +obje3.x +"y icin :" +obje3.y); //obje3 i�in x :20y icin :40
		

	}

}
