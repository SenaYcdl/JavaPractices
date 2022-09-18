package Practice07;

public class Q04Arrays {

    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */


        String cumle ="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle = cumle.replace(" ", "");
        System.out.println("str = " + cumle);

        System.out.println("str.length() : " + cumle.length());

        String harf[] = cumle.split("");
        System.out.println(harf.length);

        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] =str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);

        String charcter [] = str1.split("");
        System.out.println("charcter sayisi  = " + (charcter.length-boslukSayisi));


    }
}
