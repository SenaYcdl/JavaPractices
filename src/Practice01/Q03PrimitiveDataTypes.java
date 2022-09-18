package Practice01;

public class Q03PrimitiveDataTypes {

    /*
        * Primitive data type
               byte: only takes whole numbers
               short: only takes whole numbers
               int(used more often): only takes whole numbers
               long: only takes whole numbers
               float: can take decimals (MUST have F or f at the end)
               double( used more often): can take decimals
               boolean: true or false boolean expressions
               char: character within single quote ''
                       also takes number
        * Range: double > float >long > int >short > byte
        */
    //byte, short, integer veri tiplerinin max ve min degerlerini yazdiralim.
    public static void main(String[] args) {
        int intMax=Integer.MAX_VALUE;
        int intMin=Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        byte byteMax= Byte.MAX_VALUE;
        byte byteMin= Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shrtMax=Short.MAX_VALUE;
        short shrtMin=Short.MIN_VALUE;

        System.out.println("shrtMax = " + shrtMax);
        System.out.println("shrtMin = " + shrtMin);


        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        float floMax=Float.MAX_VALUE;
        float floMin=Float.MIN_VALUE;

        System.out.println("floMax = " + floMax);
        System.out.println("floMin = " + floMin);

        double dblMax=Double.MAX_VALUE;
        double dblMin=Double.MIN_VALUE;

        System.out.println("dblMax = " + dblMax);
        System.out.println("dblMin = " + dblMin);

        long lgMax=Long.MAX_VALUE;
        long lgMin=Long.MIN_VALUE;

        System.out.println("lgMax = " + lgMax);
        System.out.println("lgMin = " + lgMin);

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat=999.99f;
        double kilometre=34.56;
        char seviye= 'A';
        boolean dogruMu= true;

        System.out.println("dogruMu = " + dogruMu);
        System.out.println("seviye = " + seviye);
        System.out.println("kilometre = " + kilometre);
        System.out.println("laptopFiyat = " + laptopFiyat);


    }


}

