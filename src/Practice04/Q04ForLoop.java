package Practice04;

public class Q04ForLoop {

    public static void main(String[] args) {

        /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
         */


        int bas = 100;
        int bitis = 1;
        int toplam = 0;

        if (bas >= bitis) {
            for (int i = bas; i >= bitis; i--) {
                if (i % 13 == 0) {
                    System.out.println(i);
                    toplam += i;
                }
            }

        } else {
            for (int i = bitis; i <= bas; i++) {
                toplam += i;
            }
        }
        System.out.println("Sayilarin toplami:" + toplam);


    }

}
