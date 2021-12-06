package day003;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		//sayi++ sayi-- de gecerlidir
	int sayi=10;
	sayi++;
	sayi++;
	sayi++;
	System.out.println(sayi);
	System.out.println(sayi++);//iki islem var bir artirma bir yazdirma
	System.out.println(sayi);
	//once artirmak sonra yazdirmak istersek ++sayi
	//once yazdirmak sonra artirmak istersek sayi++
	System.out.println(++sayi);
	}

}
