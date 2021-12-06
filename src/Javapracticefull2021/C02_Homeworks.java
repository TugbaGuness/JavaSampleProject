package Javapracticefull2021;

public class C02_Homeworks {

	public static void main(String[] args) {
		// variables;
		//String str1= "Java";
		//String str2= "Guzel";
		//int sayi1=5;
		//int sayi2=4;
		
		//1) Java Guzel 54    2)Java 5 Guzel
		//3) Java 94          4)Java 19       5)54 Guzel
		
		String str1= "Java";
		System.out.println(str1);
		String str2= "Guzel";
		System.out.println(str2);
		int sayi1=5; 
		System.out.println(sayi1);
		int sayi2=4;
		System.out.println(sayi2);
		
		
		
		System.out.println(str1+" "+str2+" "+sayi1+sayi2); //Java Guzel 54 
		System.out.println(str1+" "+(sayi1+sayi2)+sayi2);  //Java 94
		System.out.println(str1+" "+sayi1+" "+str2); // Java 5 Guzel
		System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2)); //Java 19
		System.out.println(sayi1+""+ sayi2+" " + str2); //54 Guzel
		
		   
		
		        
		     
		  
		

	}

}
