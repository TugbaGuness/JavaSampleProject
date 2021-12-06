package day32_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder ("Java candir can");
		sb.delete(12, 15); //dinamik olmaz
		System.out.println(sb); //Java candir 
		sb.delete(12, sb.length());//Java candir 
		System.out.println(sb); 
		
		
		
		
		
	}

}
