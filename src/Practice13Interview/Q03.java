package Practice13Interview;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


        /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */


        Scanner scan=new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str=scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }if(str.equalsIgnoreCase(tersStr)){
            System.out.println("Palnidrom'dur");
        }else {
            System.out.println("Palindrome degildir");
        }

    }
}
