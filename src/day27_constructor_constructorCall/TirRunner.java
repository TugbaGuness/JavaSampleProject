package day27_constructor_constructorCall;

public class TirRunner {
	public static void main(String[] args) {
		//bir tane tum ozellikleri degistiren constructor olusturalim
		
		
		Tir tir1=new Tir(5000, "axtor", "beyaz", 2020, false);
		
		System.out.println(tir1.km+tir1.model+tir1.renk+tir1.yil+tir1.satilikMi);
		//5000axtoraxtor2020false
		 int yil=2000;
		 String renk;
		 String model;
	     int km;
		 boolean satilikMi;
		 
		 
		 
		 //uc ozelligi degistiren bir constractur olusturalim
		 //km,model,renk
		 
		 Tir tir2= new Tir(12000, "kar", "beyaz");
	}

}
