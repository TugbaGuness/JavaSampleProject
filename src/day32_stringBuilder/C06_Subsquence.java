package day32_stringBuilder;

public class C06_Subsquence {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder ("Java ogrendik");
        sb.subSequence(3, 7);//karakterleri yanyana getiri string olarak getirmez
        System.out.println(sb.subSequence(3, 7));//a og
        sb.substring(3);
        System.out.println( sb.substring(3));//a ogrendik
        
        
        
        
        
	}

}
