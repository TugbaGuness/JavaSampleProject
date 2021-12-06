package day006_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		int sayi1=10;
		Integer sayi2=20;
		
		//sayi1. yazdigimizda hicbirsey cikmaz cunku sayi1 int
		
		//sayi2. yazdigimizde bircok method gelir
		
		String tel1= "3578987";
		String tel2= "3245434";
		System.out.println(tel1+tel2); //35789873245434
		//bu sayilari toplamak istersek
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		//6824421
		
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
		System.out.println(Short.MAX_VALUE);//32767
		
		//String caddeNo= "B203";
		String sokakNo= "1564";
		String caddeNo= "203";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
        //1767

	//Integer.valueOf(string numerik ifade) methodu string olarak
		// kaydedilmiþ numarik ifadeleri sayiya cevirir fakat
		//numerik olmayan karakter olursa hata verir
		//stops execution denir
		
		System.out.println("Hello World");
		
		
		
	
	
	
	
	}

}
