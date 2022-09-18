package Practice02;

import java.util.Scanner;

public class Q01Scanner01 {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz: ");
        int s1=scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int s2=scan.nextInt();
        int toplam=s1+s2;
        System.out.println("toplam: " + toplam);


    }
}


