package day21_scope_arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		
		int sayi=10;
		for (int i = 0; i < 30; i++) {
			String isim="Ali";
			System.out.println(sayi + " " + isim);
			
		}
		
		
		//System.out.println(isim);
		//loop icinde kullanilan variablelar loop disinda kullanilamazlar
		//loop dan once olusturulur ve emniyette kalmak icin initialize yapariz
		
		
		
		
		
		
		
		for (int i = 0; i < 10; i++) {
		
			//int sayi=20; sayi variable'i main methodun icinde olusturuldugundan tum
			//main methodda gecerlidir ayni isimde bir variable olusturamazsiniz
			
			String isim="Veli";
			
		}
		

	}

}
