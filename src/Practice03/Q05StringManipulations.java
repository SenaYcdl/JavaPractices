package Practice03;

public class Q05StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        String isim="Sena";
        String soyisim="Yucedal";

        if (isim.length()> soyisim.length()) {
            System.out.println(isim);
        } else if (isim.length()== soyisim.length()) {
            System.out.println("Isminiz soyisminiz ile esit uzunluktadir");
        }
        else {
            System.out.println(soyisim);
        }
    }

}
