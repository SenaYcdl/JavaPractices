package Practice05;

import java.util.Scanner;

public class Q01ForLoop {

    public static void main(String[] args) {

        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf=scan.next().toLowerCase();

        String sesliHarfler= "aeiou";
        String sessizHarfler="bcdfghjklmnprstvyzxw";

        if (harf.length()==1) {
            for (int i=0; i<sesliHarfler.length(); i++) {
                if (sesliHarfler.contains(harf)) {
                    System.out.println("Sesli harf");
                    break;
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println("Sessiz harf");
                    break;
                } else
                    System.out.println("Yanlis karakter");
                break;
            }
        }
        else
            System.out.println("Birden fazla karakter giridiniz");

    }
}
