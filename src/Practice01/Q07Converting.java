package Practice01;

import java.util.Scanner;

public class Q07Converting {
    public static void main(String[] args) {

        /* interview sorusu
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // soru 2 Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */
        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1= gallon + " gallon degeri " + litre + " litreye esitti ";
        System.out.println(sonuc1);


        int l=1000;
        double G=l/3.785;
        System.out.println(l + " litre degeri " + G + " gallona esittir ");


        // soru 2

        Scanner scan=new Scanner(System.in);
        System.out.print("fahrenayt degerini giriniz: ");
        double fh=scan.nextDouble();
        // c = (f-32)*5/9
        System.out.println("girdiginiz fahrenayt degeri: " + fh + " karsiligi " + (fh-32)*5/9 + " santigrat derecedir." );


    }

}

