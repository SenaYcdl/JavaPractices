package Practice13Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

        List<Integer> fibonacciList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);

        int i=1;
        if(sayi<=1) {
            System.out.println("Daha buyuk sayilar gir");
        }else {
            while(fibonacciList.get(i)<sayi){ //fibonacci elemanlari sayidan kucuk oldugu surece
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1)); //bir onceki elemani yanindaki eleman ile toplar
                i++;
            }

            System.out.println("fibonacciList = " + fibonacciList);
        }

        int sonIndexdekiEleman=fibonacciList.size()-1;
        if (fibonacciList.get(sonIndexdekiEleman)>sayi){
            fibonacciList.remove(sonIndexdekiEleman); //son elemani kaldirir
            System.out.println("Girilen sayi fibonacci dizisinde bulunmamaktadir = " +
                    "sizin girdiginiz sayiya kadar ki fibonacci dizisi budur " + fibonacciList);

        } else
            System.out.println("Girdiginiz sayi fibonacci listinde var" + fibonacciList);



        /*
        FOR COZUMU

        List<Integer> sayilar=new ArrayList<>();
        int sayi=15;
        int sayi1=0;  // ilk sayi her zaman 0 dan basladıgından 0 a atadım
        sayilar.add(sayi1);  // bu int degeri listime  ekledim
        int sayi2=1;   // ikinci sayida her zaman 1 oldugundan ikinci sayiyi atadım
        sayilar.add(sayi2);  // Bunuda listime ekledim .
        int sayi3;
        for (int i = 0; i <sayi ; i++) {  // girilen sayiyaya kadar dongu kurdum
            sayi3=sayi1+sayi2;      // sayi3ün toplamini buldum
            sayilar.add(sayi3);   // buldugum sayiyiy listeye ekledim.
            sayi1=sayi2;        // dongu devam ettikce sayilari da esitleme yaptım
            sayi2=sayi3;
        }
        System.out.println("Girilen Fibonacci sayilarin Listesi : " +sayilar);
         */

    }
}
