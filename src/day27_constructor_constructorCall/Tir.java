package day27_constructor_constructorCall;

public class Tir {
	
	
	public int yil=2000;
	public String renk;
	public String model;
	public int km;
	public boolean satilikMi;
	
	
	public Tir(int i, String string, String string2, int j, boolean b) {
		//     km         model        renk           yil    satilik mi
		
	
		// Tirrunner classindan yolladigimiz degerlerin instance variable'lar
		//ile eslesmesi icin atamalari yapmam lazim
	
	km=i;
	model=string;
	renk=string;
	yil=j;
	satilikMi=false;
	
	
}


	public Tir(int km, String model, String renk) {
		// i, string guzel isimler degil
		//kodumuzu sonradan incelerken anlasilir degil
		//daha anlasilir olmasi icin variable isimleri anlamli olsun
		//km,model,renk sirasi
		
		this.km=km; //bu classtaki km yi al dedi scope taki degil
		this.model=model;
		this.renk=renk;
		
		
		
		
		
		
		
	}
}