package _03_IfStatement_TernaryOperator;

public class Q09 {

    public static void main(String[] args) {

       /*   45 degerinde bir double olusturun.
            Eger double 5'e bolununce kalan 0 ise ve double 8'e bolununce kalan 0 ise
            bolununce "able to divide by 5 and 8 "yazdiriniz.

            Eger double 10'a bolununce kalan 5 ise ve double 9'a bolununce  kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdiriniz.
        */
    	double sayi=45;
    	if (sayi%5==0 && sayi%8==0) {
    		System.out.println("able to divide by 5 and 8 ");
			
		} else if(sayi%10==5 && sayi%9==0){
			System.out.println("able to divide by 9 and divide by 10 reminder is 5");
			}
				
	

        
    }
}
