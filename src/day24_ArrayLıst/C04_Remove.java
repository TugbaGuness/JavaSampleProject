package day24_ArrayL�st;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
	public static void main(String[] args) {
	
		//CMD girin. cd desktop yaz�n. git clone diyin ve hocan�n adresini girin. 
		//masa�st�n�zde, hay�rl� olsun.
		
		
		List<String> harfler= new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		System.out.println(harfler);//[A, Z, F, D]
		
		harfler.remove("Z"); //Z harfini siler
		System.out.println(harfler.remove("Z"));//sildigi icin false yazar
		harfler.remove(1); //1. indexteki harfi siler
		
		
		System.out.println(harfler); //[A, F, D]
		
		
		
	}
}
