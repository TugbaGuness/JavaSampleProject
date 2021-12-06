package _08_DoWhile;

import java.util.Scanner;
public class Q012 {
    //Bir top belirli yükseklikten atýlmaktadýr.
    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulan do while code blogu create ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double yukseklik = scan.nextDouble();
        double topunToplamYolu=0;
        int yerevurmaSayisi=0;
        do {
            yerevurmaSayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=(0.75);
            topunToplamYolu+=yukseklik;
        }
        while (yukseklik>=1);
        System.out.println("topun vurma sayisi:"+yerevurmaSayisi);
        System.out.println("topunaldigi toplam yol : "+topunToplamYolu);
    }
}
