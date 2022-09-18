package Practice12Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PIslemler {

    static List<Kisi> ogretmenList = new ArrayList<>();
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    //static yazmamaizin sebebi tum methodlardan ulasmak icin
    //gokteki ay gibi heryeden ulaşılabilsin
    static String KisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();
        //kullanici kucuk harf girse bile buyuk harfe cevirdik
        switch (secim) {

            case "1":
                KisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":

                KisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("****Hatali Giris****");
                girisPaneli();
                break;
        }


    }

    private static void islemMenusu() {

        System.out.println("Sectiginiz kisi turu " + KisiTuru + " icin lutfen asagidaki islemleri seciniz: ");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("Islem tercihinizi giriniz: ");
        int secilenIslem= scan.nextInt();

        switch (secilenIslem) {

            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli(); //yani ana menu
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Guzel birsey gir");
                islemMenusu();
                break;
        }
    }

    private static void cikis() {

        System.out.println("Isleminiz basariyla gerceklesmistir");
    }

    private static void silme() {


        System.out.println("*******" + KisiTuru + "silme sayfasi *******");
        boolean kontrol=true;

        if (KisiTuru.equals("OGRENCI")) {
            scan.nextLine(); // dummy
            System.out.println(); //bos satir
            System.out.println("silinecek ogrencinin kimlik no giriniz:");
            String silinecekKimlikNo=scan.next();


            for( Kisi k :ogrenciList) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Silinen ogrenci: " + k.getAdSoyad());
                    ogrenciList.remove(k);
                    kontrol=false;
                    break;
                }

            }if (kontrol){
                System.out.println("Silinecek ogrenci listede yoktur.");
            }

        }else {
            System.out.println("Silinecek ogretmenin kimlik no giriniz:");
            String silinecekOgretmenKimlikNo=scan.next();

            for( Kisi k :ogretmenList) {
                if (k.getKimlikNo().equalsIgnoreCase(silinecekOgretmenKimlikNo)) {
                    System.out.println("Silinecek ogretmen: " + k.getAdSoyad());
                    ogretmenList.remove(k);
                    kontrol=false;
                    break;
                }

            }if (kontrol){
                System.out.println("Silinecek ogretmen listede yoktur.");
            }

        }
    }


    private static void listeleme() {

        System.out.println("Ogretmen Listesi: " + ogretmenList);
        System.out.println();//bosluk
        System.out.println("Ogrenci Listesi: " + ogrenciList);
    }

    private static void arama() {

        //bu method ogrenci ya da ogretmen aramasi icin yapildi

        System.out.println("*******" + KisiTuru + "arama sayfasi *******");
        boolean kontrol=true;

        if (KisiTuru.equals("OGRENCI")) {
            scan.nextLine(); // dummy
            System.out.println(); //bos satir
            System.out.println("aradiginiz ogrencinin kimlik no giriniz:");
            String arananKimlikNo=scan.next();


            for( Kisi k :ogrenciList) {
                if (k.getKimlikNo().equals(arananKimlikNo)) {
                    System.out.println("Aranan ogrenci: " + k.getAdSoyad());
                    kontrol=false;
                }

            }if (kontrol){
                System.out.println("Aradiginiz ogrenci listede yoktur.");
            }

        }else {
            System.out.println("aradiginiz ogretmenin kimlik no giriniz:");
            String arananKimlikNo=scan.next();

            for( Kisi k :ogretmenList) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("Aranan ogretmen: " + k.getAdSoyad());
                    kontrol=false;
                }

            }if (kontrol){
                System.out.println("Aradiginiz ogretmen listede yoktur.");
            }

        }
    }

    private static void ekle() {

        //bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi

        System.out.println("**** "+ KisiTuru +" ekleme sayfasina hosgeldiniz");
        scan.nextLine();
        System.out.println("isim soyisim gir");
        String adSoyad=scan.nextLine();


        System.out.println("kimlik gir");
        String kimliNo=scan.nextLine();

        System.out.println("yas gir");
        int yas=scan.nextInt();
        scan.nextLine();

        if (KisiTuru.equals("OGRENCI")){ //TODO sonra doldur

            System.out.println("Ogrenci no giriniz: ");
            String ogrenciNo=scan.nextLine();

            System.out.println("Sinif no giriniz: ");
            String sinif=scan.nextLine();

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimliNo,yas,ogrenciNo,sinif);
            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);


        }else{ // ogretmen ekleme icin
            System.out.println("bolum gir");
            String bolum= scan.nextLine();

            scan.nextLine();//dummy6 kod hata almamak icin
            System.out.println("sicil no gir");
            String sicilNo= scan.nextLine();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimliNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);
        }

    }
}
