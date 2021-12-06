package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("ATM'ye Hosgeldiniz...");

        String islemler = "1.islem : Bakiye ogrenme\n2.islem : Para Yatýrma\n"
                + "3.islem : Para cekme\n"
                + "4.islem : Cikis";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yapmak istediginiz islemi seciniz: ");
        String islem = scan.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz: " + bakiye);
                break;

            case "2":
                System.out.print("Yatirmak istediginiz tutari girin: ");

                int tutar = scan.nextInt();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;


            case "3":
                System.out.print("Cekmek istediginiz tutari girin: ");
                int tutar2 = scan.nextInt();


                if (tutar2 <= bakiye) {
                    bakiye -= tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                } else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
                break;

            case "4":
                System.out.println("Cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz islem...");
                break;
        }

    }
}

