package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		//Cumlesinin kelimelerini ozel karakterler ve noktalama
		//isaretleri olmadan harf sirasina gore yazdiralim
		
		String str="Java ogrendim,  #cok para ?kazandim.,";
		
		String kelimeler[]=str.split(" ");
		System.out.println(Arrays.toString(kelimeler));//[Java, ogrendim,, , #cok, para, ?kazandim.,]
		
for (int i = 0; i < kelimeler.length; i++) {
	System.out.println(kelimeler[i]);
	
	kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
	
	
}
Arrays.sort(kelimeler);
System.out.println(Arrays.toString(kelimeler));//[, Java, cok, kazandim, ogrendim, para]
Arrays.sort(kelimeler);

for (int i = 0; i < kelimeler.length; i++) {
	
	System.out.print(kelimeler[i]+ " ");
	
	
	
}
	}

}
