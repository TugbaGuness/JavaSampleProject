package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	String isimler[] = {"Hacer" ,"ainagul", "Emine", "Murat", "Kutllu"};
	
	//isimler Arrayinde Murat ismi var mý?
	//arrayda arama yapmadan once siralama yapmaliyiz
	
	
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler));//[Emine, Hacer, Kutllu, Murat, ainagul] a kucuk olunca sona atti
	
	
	//arrays class ile sort yaptýgýmýzda arrayimiz kalici olarak degisir
	// sort methodu elementleri natural ordera gore siralar
	
isimler[4]="Ainagul";
Arrays.sort(isimler);
System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutllu, Murat] Abuyuyunce basa geldi

System.out.println(Arrays.binarySearch(isimler,"Murat"));// 4 
System.out.println(Arrays.binarySearch(isimler,"Mehmet"));//-5 Murattan once gelir

	}

}
