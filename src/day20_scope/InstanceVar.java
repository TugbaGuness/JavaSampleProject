package day20_scope;

public class InstanceVar {
	int notMat=50;
	int notFen;
//intance variablelarin scope unda main method yoktur
	public static void main(String[] args) {
		// main method static oldugu icin static olmayan
				//variablelar main method da direk kullanilamaz ve goruntulenemz
				
		//intance variablelara main methoddan ulasmak istersek obje olusturup
				//obje uzerinden erisim saglayabiliriz
				//icinde oldugumuz classtan bir obje olusturalim
				
				InstanceVar celil=new InstanceVar();
				System.out.println(celil.notMat); //50
				InstanceVar nihal=new InstanceVar();
				
				nihal.notMat=70;
				//instance variablelarda deger atamazsak java ýntantence olarak atana  degeri alir
				//bu class icin notMat=50 gibi
				//ama istersek degerde atayabiliriz
				//bu durumda deger atadigimix obje icin yeni deger gecerli olur
				
				System.out.println(celil.notMat); // 50
				//celilin notunu degistirmek icin celil.notMata deger atamaliyiz
				celil.notMat=90;
				System.out.println(celil.notMat); //90
		
celil.method2();
	}
	
	public static void staticMethod() {
		//instance variablelara static method uygulanmaz
		//System.out.println(notFen);
	
		
	}
public void method2() {
	
	System.out.println(notFen); //0
	//Static olmadigi icin instance variablelara ulasilabilir
	//intance variable olustururken deger atanmasa da olur
	//bu duurumda java default deger atar
	//int default deger 0 dir
	
	notFen=100;
	System.out.println(notFen); //100
}
}
