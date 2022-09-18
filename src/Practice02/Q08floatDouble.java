package Practice02;

import java.util.Scanner;

public class Q08floatDouble {
    public static void main(String[] args) {

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("float bir sayi giriniz");
        float a= scan.nextFloat();
        /
         */

        float floatSayi = 112.153f;
        short shortSayi = (short) floatSayi;
        System.out.println(floatSayi);

        double doubleSayi = 13.1333d;
        int intSayi = (int) doubleSayi;

        long longSayi = 1234567890;
        float a= (float) longSayi;



        Scanner scan=new Scanner(System.in);
        System.out.println("Zaman:");
        int saniye = scan.nextInt();
        int dakika = saniye/60;
        int saat = dakika/60;

        dakika=dakika%60;
        saniye=saniye%60;

        System.out.printf("%02d:%02d:%02d", saat,dakika,saniye);



    }
}

