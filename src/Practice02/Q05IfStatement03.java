package Practice02;

import java.util.Scanner;

public class Q05IfStatement03 {
    public static void main(String[] args) {

        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Unvaninizi girin");
        String unvan = scan.nextLine();

        if (unvan.equals("qa")) {
            System.out.println("quality analyst");
        } else if (unvan.equals("dev")) {
            System.out.println("developer");
        } else if (unvan.equals("ba")) {
            System.out.println("business analyst");
        } else if (unvan.equals("pm")) {
            System.out.println("project manager");

        } else {
            System.out.println("gecersiz");
        }

    }
}
      /* baska bir cozum

      switch(jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlis formatta jobtitle bilgisi girdiniz...");
       */

