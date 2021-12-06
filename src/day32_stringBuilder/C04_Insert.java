package day32_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder ("Java ogrendik");

		sb.insert(4, "yi cok iyi");
		System.out.println(sb);//Javayi cok iyi ogrendik
		
		sb.insert(6, " cok", 0, 4);
		System.out.println(sb); //Javayi cok cok iyi ogrendik
		
	}

}
