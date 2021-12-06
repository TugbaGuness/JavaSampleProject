package day009_ýfNested;

public class C03_Tenrary {

	public static void main(String[] args) {

        int x=10;
        String tekMiCiftMi = x%2==0 ? "cift sayi"  : "tek sayi";
        System.out.println(tekMiCiftMi); //cift
        System.out.println(x%2==0 ? "cift sayi"  : "tek sayi");
        
       //Eger tenrary de donecek sonuclar ayni data turunden degilse atama yapilmaz
        //sadece syso ile yazdirilir
        System.out.println(x>5 ? "Aferin" : 4);
       

	}

}
