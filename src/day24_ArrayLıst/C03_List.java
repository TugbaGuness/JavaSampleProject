package day24_ArrayLıst;

import java.util.ArrayList;
import java.util.List;

public class C03_List {

	

	public static void main(String[] args) {
		//Verilen bir arrayden istenen degere sahip
		//elementleri silip kalani yeni bir array olarak kaydedin
		//sonra yeni arrayi yazdirin
		
		
		int arr[]= {3,4,5,6,3,5};
		int sil=3;
	
		List<Integer> gecici= new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sil) {
				gecici.add(arr[i]);
				
			} 
			
		}
		
       System.out.println(gecici); //List olarak istenmeyen tum elemanlri goruruz
	}

	
	
    //sonuc Array isteniyorsa 
	//listedekileri yeni arraye ekleyebiliriz
	
	
	
}
