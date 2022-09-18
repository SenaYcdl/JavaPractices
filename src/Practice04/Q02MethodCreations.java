package Practice04;

public class Q02MethodCreations {

    public static void main(String[] args) {

        /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */


        double a=564;
        metreVekilometreyeDonustur(a);


    }

    public static void metreVekilometreyeDonustur(double a) {

        double m= a /100;
        double kilomt=  a/ 100000;
        System.out.println("100 cm " + m + " m dir");
        System.out.println("100 cm " + kilomt + " kilometredir");


    }
}
