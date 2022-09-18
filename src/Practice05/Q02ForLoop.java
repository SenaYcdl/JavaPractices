package Practice05;

import java.util.Scanner;

public class Q02ForLoop {

    public static void main(String[] args) {

        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan=new Scanner(System.in);
        System.out.println("1 den buyuk bir tamsayi giriniz");
        int a=scan.nextInt();
        int toplam=0;

        for (int i=1; i<a; i++) {
            toplam+=(i*i);

        }

        System.out.println("Sayilarin karelerinin toplami: "+ toplam);

    }
}
