package day30_staticBlocks;

import java.util.ArrayList;
import java.util.List;

public class C03_PassVyValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		//list elemanlarini degistir methodu yazalim
		//sonra list elemanlarindan bazilarini degistirelim,
		//method void yazalim
		//main method'a dondukten sonra yeniden list yazdiralim
		
		
		List<String>harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");		
		listElemanDegistir(harfler);
		System.out.println("Main Methoda donunce degisen list " +harfler);
		//Main Methoda donunce degisen list [D, B, C] list ici degismiyor bunda
		listDegistir(harfler);
		System.out.println(harfler);//burda ise degismiyor asagida bos atama yaptigi halde
		//[D, B, C] 
		//Javada list ve Array gibi objeler icinde pass by value gecerlidir
		//farkli methodda array veya liste yeni deger atamasi yaparsak 
		//orjinal array ve list degismez
		//listdegistirde yeni deger atadigimiz halde harfler listesi degismedi
		
		
		
		
	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println(harfler); //[] yukarida bir ustte bosa atadik
		
	}

	private static void listElemanDegistir(List<String> harfler) {
		harfler.set(0, "D");
		System.out.println("Methodda degisen list " +harfler);
		//Methodda degisen list [D, B, C]
	}

		
	}


