package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       seklini konsola yazdiriniz.

        
    	  for (int satir = 1; satir <= 6; satir++) {//sat�r kontrol�

              for (int bosluk = 1; bosluk < satir; bosluk++) {// bo�luk yazd�rma

                  System.out.print(" ");
              }
              for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu

                 System.out.print(rakam + " ");// rakam+ " " olazsa sa�a dayal� olur d�zg�n ��gen olmaz
              }
              System.out.println();
          }
    }
}


