package Practice02;

import java.util.Scanner;

public class Q03IfStatement01 {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Y/N ikilisinden birisini giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("Yes");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("No");

        } else {
            System.out.println("Gecersiz karakter");
        }


    }
}

