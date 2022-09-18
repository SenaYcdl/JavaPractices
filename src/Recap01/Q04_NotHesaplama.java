package Recap01;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Vize1 notunuzu giriniz");
        int vize1=scan.nextInt();
        System.out.println("Vize2 notunuzu giriniz");
        int vize2=scan.nextInt();
        System.out.println("Final notunuzu giriniz");
        int fnl=scan.nextInt();


        int vizetoplam=((vize1+vize2)*30/100);
        int fnltoplam=fnl*70/100;
        System.out.println(vizetoplam+fnltoplam);





    }
}
