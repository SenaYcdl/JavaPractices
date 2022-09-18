package Practice07;

import java.util.Arrays;

public class Q02MultiD {

    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] arr=  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;
        for (int i=0; i<3; i++) { //outer for
            for (int j=0; j<3; j++) { //inner for
                if (arr[i][j].contains("$")) { //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$", ""))*3.2;
                    //parantez icindeki replaceAlLL methodu ile dolar isarerinden kurtulduk
                    //sonra elimizde "12" var (data type:String)
                    //Double toplam variable ile isleme katmak icin data casting yapmak gerekir
                    //bu yuzden Double.parseDouble methodu kullandik

                } else
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;

            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Toplam: " + toplam);
    }
}
