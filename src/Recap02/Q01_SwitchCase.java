package Recap02;

public class Q01_SwitchCase {
    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String input = "Pazar";


        switch (input) {

            case "Pazartesi", "pazartesi" :
            case "Sali" , "sali" :
                System.out.println("Java dersi gunleri");
                break;

            case "Persembe", "persembe" :
            case "Cuma", "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;

            case "Carsamba", "carsamba":
            case "Cumartesi", "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            default:
                System.out.println("Izin gunu");




        }
    }
}
