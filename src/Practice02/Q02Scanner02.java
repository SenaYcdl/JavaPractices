package Practice02;

import java.util.Scanner;

public class Q02Scanner02 {
    public static void main(String[] args) {

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adınızı gırınız");
        String line = scanner.nextLine();
        System.out.println("Lutfen memleket gırınız");
        String line2 = scanner.nextLine();
        System.out.println("Lutfen konum gırınız");
        String line3 = scanner.nextLine();
        System.out.println("Lutfen boy gırınız");
        double boy= scanner.nextDouble();
        System.out.println("Lutfen yas gırınız");
        int yas= scanner.nextInt();

        System.out.println("Yasadiginiz " + line3 +  "yi seviyor musunuz");
        boolean seviyorMU= scanner.hasNextBoolean();
        System.out.println("isim:" + line);
        System.out.println("memleket:" + line2);
        System.out.println("konum:" + line3);
        System.out.println("boy:" + boy);
        System.out.println("yas:" + yas);
        System.out.println("seviyorMU = " + seviyorMU);
    }
}
