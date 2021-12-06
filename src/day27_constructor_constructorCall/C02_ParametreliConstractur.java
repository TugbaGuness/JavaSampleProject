package day27_constructor_constructorCall;

import day25_arrayList.Car1;

public class C02_ParametreliConstractur {

	public static void main(String[] args) {
		// Java nin olusturdugu default constractur ile
		//obje olusturabiliyoruz ama her seferinde
		//yeniden deger atamasi yapmak uzun oluyor
		//istersek parametreli constracturlar olusturup
		//daha obje olusurken şstedgim ozellikleri atayabilirim

		Car1 car1=new Car1(50000, "Vectra", "kirmizi", 2015, true);
		
		Car1 car2=new Car1(35000);
		
		System.out.println(car2.km);//35000
		
		Car1 car3=new Car1();
		
		System.out.println(car3.km);//0
		
		Car1 car4=new Car1(1000);
		
		System.out.println(car4.km);//1000	
		//yil ve kmyi parametre olarak girebilecegim bir constractur 
		//olusturalim
		
		Car1 car5=new Car1(2020, 5000);
		System.out.println(car5.km+" " + car5.yil+" " +car5.model); //5000 2020 null
		
		
	}

}
