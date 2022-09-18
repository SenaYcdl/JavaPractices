package Practice02;

import java.util.Scanner;

public class Q06Ternary {
    public static void main(String[] args) {

        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen bir fiyat giriniz");
        int fiyat=scan.nextInt();

        System.out.println(fiyat<10 ? "fiyat ucuz" : fiyat>=10 && fiyat<=20 ? "fiyat normal" : "fiyat pahali");
    }
}
             /*baska bir cozum

             int fiyat =10;
        if(fiyat<10){
            System.out.println("ucuz");
        }else if(fiyat<20){
            System.out.println("normal");
        }else System.out.println("pahali");
              */

