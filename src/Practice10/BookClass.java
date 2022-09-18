package Practice10;

public class BookClass {

    //String adi, yazari;
    //int yayinYili;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin

    public static void main(String[] args) {

        Book b1= new Book();
        b1.name="Persuasion";
        b1.author="Jane Austen";
        b1.year=1817;
        b1.page=345;
        System.out.println(b1);

        System.out.println("");

        Book b2= new Book("Pride & Prejudice", "Jane Austen",1813);
        System.out.println(b2);

        System.out.println("");

        Book b3=new Book();
        System.out.println(b3);

        System.out.println("");

        Book b4=new Book();
        b4.name="Emma";
        b4.author="Jane Austen";
        b4.year=1815;
        System.out.println(b4);


    }
}
