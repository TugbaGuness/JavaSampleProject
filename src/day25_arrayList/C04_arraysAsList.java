package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_arraysAsList {

	public static void main(String[] args) {
		//verilen arrayi arrays classýndan 
//yardim alarak liste cevirebiliriz
		String arr[]= {"A","B","c","D"};
		List<String>arraydenList=Arrays.asList(arr);
		System.out.println(arraydenList);//[A, B, c, D]
		
		//arraydenList.add("F");//RTE Desteklenmeyen islem
		//CTE olmasi icin sytax te problem olmasi lazim
		//ancak bu yazimda syntax hatasi yok
		
		
		//bu sekilde Arrays class'indan yardim alarak array'i 
		//liste cevirirsek olusturdugumuz listin boyutu sabit olur
		//dolayisiyla add() ve ya clear()gibi methodlari calistirmak
		//istersek UnsupportOperation: Desteklenmeyen islem verir
		
		arr[1]="Z";
		System.out.println("Array'i degistirdikten sonra array:" + Arrays.toString(arr));
		System.out.println("Array'i degistirdikten sonra list:" +arraydenList);
		//array degýsýnce list otomatik degisiyor
		//cunku basta esitledik referanslari esitliyor
		
		arraydenList.set(2, "C");
		System.out.println(arraydenList); //[A, Z, C, D]
		
		System.out.println("List'i degistirdikten sonra array:" +Arrays.toString(arr));
		//[A, Z, C, D] degisti
		
	}

}
