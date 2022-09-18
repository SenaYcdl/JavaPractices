package Practice04;

public class Q01MethodCreations {

    public static void main(String[] args) {

        /* interview sorusu
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */


        String input="aabbcccccddddaaa";
        tekrarsizYazdir(input);


    }

    public static void tekrarsizYazdir(String input) {

        String tekrarsiz="";
        tekrarsiz+=input.substring(0,1);

        for (int i=0; i<input.length(); i++)  {
            if (!tekrarsiz.contains(input.substring(i,i+1))) { // i yi al i+1 i alma demektir yani ilk karakteri al sonraki ayni karakteri alma
                tekrarsiz+=input.substring(i,i+1);

            }

        }
        System.out.println(tekrarsiz);
    }
}
