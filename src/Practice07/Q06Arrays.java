package Practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q06Arrays {

    public static void main(String[] args) {

         /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
     */

        farkiniBul();



    }

    public static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.print("Array uzunlugunu giriniz: ");
        int uzunluk = scan.nextInt();
        int [] arr =new int [uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Arrayin " + (i+1) + " . elemanini giriniz:" );//i oldugunda 0.eleman diyecek,index degil direk eleman sorduk
            arr[i]=scan.nextInt(); // for i den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemnlar okunur
        }

        Arrays.sort(arr);
        System.out.println("Arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark: " + (arr[uzunluk-1]-arr[0]));


        /*
        odevv
        bu soruyu Math classi kullanarak coz
         */
    }
}
