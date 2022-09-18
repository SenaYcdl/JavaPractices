package Practice13Interview;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        method create ediniz


      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız
      */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);



    }

    private static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {


        for(int i=1; i<=sayi; i++) { //recursive islemi yani method icinde methodun kendisini cagirdik
            armstrong(i);

        }



    }

    private static void armstrong(int sayi) {

        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi; //sayiyi sayinin kupler toplami ile kiyaslamak icin

        while (sayi>0){
            basamaktakiSayi=sayi%10; //rakam rakam ayrdik sayiyi
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi=sayi/10;
        }

        if(girilenSayi==sayininKuplerToplami){
            System.out.println("Girilen sayi armstrong sayidir = " + girilenSayi);
        } else
            System.out.println("Girilen sayi armstrong sayi degildir = " + girilenSayi);


        /*
        Math Class Cozumu

        Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayi giriniz :");
       String strSayi = scan.next();
       armstrongMethod(strSayi);
   }
    private static void armstrongMethod(String strSayi) {
       String basamak[] = strSayi.split("");
       int toplam = 0;
        for (int i = 0; i < basamak.length; i++) {
            toplam += Math.pow(Integer.valueOf(basamak[i]), basamak.length);
            System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));//2 uzeri 3 = 8
        }
        if(Integer.valueOf(strSayi)==toplam)
            System.out.println("bu bir armstrong sayidir");
        else System.out.println("bu bir armstrong sayi degildir...");
    }
         */

    }
}
