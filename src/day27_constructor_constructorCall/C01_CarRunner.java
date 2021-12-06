package day27_constructor_constructorCall;


import day25_arrayList.Car1;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku Car class'ýndan bir obje olusturalim
		
		Car1 car1=new Car1();
		System.out.println(car1.km +" "+car1.model+" ");//0 null 

		
		car1.km=75000;
		car1.model="Corolla";
		System.out.println(car1.km +" "+car1.model+" ");//75000 Corolla 
		
	}

}
