package day32_stringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Java candir");
		sb.length(); //11 yazdirilirsa
		sb.capacity(); //27 yazdirilirsa uzunlugu belirtmez isek 16 karakterli uzunluk belirtir
		StringBuilder sb3 = new StringBuilder(7);
        sb3.append("Mehlika");
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//7
        
        sb3.append("Nilgun");//sb3 e eklemek
        
        System.out.println(sb3.length());//13
        System.out.println(sb3.capacity());//16
        
        
        sb.append("Java");
        System.out.println(sb); //Java candirJava
        
        sb.append("anlasildi mi", 3, 4);//Java candirJavaa sadece a ekledi 3. den 4 e kadar olan harfi
        System.out.println(sb);
        

	}

}
