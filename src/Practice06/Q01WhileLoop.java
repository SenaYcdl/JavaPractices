package Practice06;

import java.util.Scanner;

public class Q01WhileLoop {

    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        System.out.println(basamakToplama(sayi));

    }

    public static int basamakToplama(int sayi) {

        int toplam=0;
        while (sayi!=0) {
            toplam+=sayi%10;
            sayi/=10;

        }

        return toplam;
    }
}
