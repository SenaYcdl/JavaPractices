package Practice03;

import java.util.Scanner;

public class Q06StringManipulations {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime giriniz:");
        String input=scan.nextLine();
        System.out.println("Ikinci kelimeyi giriniz:");
        String input2=scan.nextLine();

        if (input.contains(" ")) {
            System.out.println("Kelime bosluk iceriyor");
        } else {
            System.out.println("Bosluk icermiyor");
        }
        if (input2.length()==0) {
            System.out.println("bos");
        } else {
            System.out.println("bos degil");
        }


        String str="";

        System.out.println(str.contains(" ")?"boşluk var":"bosluk yok");
        System.out.println(str.isEmpty()?"string bos":"string bos değil");
    }
}
