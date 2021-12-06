package _07_ForLoop;

public class Q05 {

    public static void main(String[] args) {
// Asagidaki sekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

       //System.out.println("#####\n#####\n#####");
    	
    	for (int satir = 1; satir <= 5; satir++) {
    		for (int sutun = 0; sutun <= 5; sutun++) {
				System.out.print("#");
			}
			System.out.println();
		}
    	
    }
}
