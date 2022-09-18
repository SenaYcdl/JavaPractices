package Recap01;

import java.util.Scanner;

public class Q10_NestedTernary {
    public static void main(String[] args) {

        /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("not giriniz");
        int not= scanner.nextInt();

        System.out.println(not>=80 && not<=100 ? "gayet basarılı": not<=79 && not>=60 ? "basarli":
                not<=59 && not<=40 ? "ha gayret" : "digerleri");

        /*
        char finalNotu = 'A';
        String result = finalNotu=='A'? "Gayet Basarili" :finalNotu=='B' ? "Basarili":finalNotu=='C'? "Ha gayret":"Digerleri..";
        System.out.println("result = " + result);
         */
    }
}
