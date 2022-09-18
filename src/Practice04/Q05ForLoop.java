package Practice04;

public class Q05ForLoop {
    public static void main(String[] args) {


        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        //for ile cozum

        for (int i=0; i<=255; i++) {
            char c= (char) i; //casting yaptik,sayi,harf ve karakter icin
            System.out.println(i+ " -> " + c);
        }


        //while ile cozum

        int i=0;
        while (i<=225) {
            char sembol= (char) i;
            System.out.println(i + "-" + sembol);
            i++;
        }

        // do while cozumu

        int j=0;
        do {
            char karakter = (char) j;
            System.out.println(j + " " + karakter);
            j++;
        } while (j<=225);







    }
}
