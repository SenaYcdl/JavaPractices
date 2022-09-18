package Recap01;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {

        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();

        double BMI=(kilo/(boy*boy));
        System.out.println(BMI);

        if (BMI<=20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (20<BMI && BMI<=25) {
            System.out.println("Normal sinirlardasiniz");
        }  else if (25<BMI && BMI<=30) {
            System.out.println("Sisman kategorisindesiniz");
        } else if (30<BMI) {
            System.out.println("Obez grubundasiniz");

        } else {
            System.out.println("Gecersiz");
        }


        /*
        System.out.println("kilonuzu kg olarak giriniz :");
            double kilo =scan.nextDouble();
            double bmi=kilo/(boy*boy);
            if(bmi<=20){
                System.out.println("bmi indexiniz " +bmi + " oldukca zayifsiniz");
            }else if(bmi<=25){
                System.out.println("bmi indexiniz " +bmi + " normal sinirlardasiniz");
            }else if(bmi<=30){
                System.out.println("bmi indexiniz " +bmi + " sisman kategorisindesiniz");
            }else if(bmi>30){
                System.out.println("bmi indexiniz " + bmi + " obez grubundasiniz");
         */


    }
}
