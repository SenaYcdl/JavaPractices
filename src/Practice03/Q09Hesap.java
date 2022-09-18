package Practice03;

import java.util.Scanner;

public class Q09Hesap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String kapat = "";


        while (!kapat.equalsIgnoreCase("off")) {

            System.out.println("\n Lutfen hesaplamak istediginiz islemi giriniz.");
            int sayi1 = scan.nextInt();
            String islem = scan.next();
            int sayi2 = scan.nextInt();
            if (islem.equals("+")) {
                int toplam = sayi1 + sayi2;
                System.out.print(toplam);
            }
            if (islem.equals("-")) {
                int fark = sayi1 - sayi2;
                System.out.print(fark);
            }
            if (islem.equals("*")) {
                int carpma = sayi1 * sayi2;
                System.out.print(carpma);
            }
            if (islem.equals("/")) {
                int bolme = sayi1 / sayi2;
                System.out.print(bolme);
            }
        }
    }
}
