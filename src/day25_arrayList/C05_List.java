package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// Verilen bir listede icinde belirli bir harf olan
		//elemanlari silen bir method yaziniz
		
		List<String> str= new ArrayList<>();
		str.add("Ceyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		System.out.println(str);
		
		String silinecekharf="a";
		KillThemAll(str,silinecekharf);
		
		}

	private static List<String> KillThemAll(List<String> str, String silinecekharf) {
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--;
				
			}
			
		}
		
		System.out.println(str);
		return str;
		
	}

		
	}


