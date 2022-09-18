package Recap01;

import java.util.Scanner;

public class Q03_BMI {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Boyunuzu giriniz");
        double boy=scan.nextDouble();
        boy= boy/100;  // veya boy/=100;

        System.out.println("Vucut kitle indeksi:" + kilo/(boy*boy));

    }
}
