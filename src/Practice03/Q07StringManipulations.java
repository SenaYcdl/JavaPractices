package Practice03;

import java.util.Scanner;

public class Q07StringManipulations {

    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String input=scan.nextLine();

        System.out.println(input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1));

    }
}
