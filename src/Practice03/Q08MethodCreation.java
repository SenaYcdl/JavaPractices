package Practice03;

import java.util.Scanner;

public class Q08MethodCreation {

    public static void main(String[] args) {

        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        int sayi1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        int sayi2= scan.nextInt();
        System.out.println("Yapacaginiz islemi seciniz:");

        System.out.println("1.toplama");
        System.out.println("2.cikarma");
        System.out.println("3.bolme");
        System.out.println("4.carpma");

        System.out.print("Secim Yapiniz:");
        int secim=scan.nextInt();


        switch (secim) {
            case 1:
                System.out.println("Toplama islemi sonucu:"+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucu:"+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Bolme islemi sonucu:" + ((float)sayi1/sayi2));
                break;
            case 4:
                System.out.println("Carpma islemi sonucu:" + (sayi1*sayi2));
                break;
            default:
                System.out.println("Gecerli bir islem seciminiz");

        }




    }
}
