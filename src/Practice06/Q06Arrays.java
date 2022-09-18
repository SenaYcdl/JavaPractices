package Practice06;

import java.util.Arrays;

public class Q06Arrays {

    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str="HeySiri";
        str=str.replace("Hey", "Bye");
        String [] arr=new String[1];
        arr [0] = str;
        System.out.println(Arrays.toString(arr));




    }
}
