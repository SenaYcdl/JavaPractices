package Practice08;

public class Q10SurviveMonkey {

    public static void main(String[] args) {

        /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

        int numberOfBananas =165, survivalDays =0;
        boolean monkeyAlive = true;

        do {
            System.out.println("Maymun gunde 4 muz yer");
            numberOfBananas-=4; // toplam muzdan 4 azalir
            survivalDays++; // yasadigi gun sayisini 1 arttir
            if (numberOfBananas<4) { // 4 den az muz kalirsa
                monkeyAlive=false; // maymun hayatta degil
                System.out.println("Bugun " + survivalDays + " .gun muz kalmadi,maymun sizlere omur...");
            } else
                System.out.println("Bugun " + survivalDays + " . gun maymun hala hayatta...:)");

        } while (monkeyAlive);
        System.out.println("Toplam yasadigi gun sayisi: " + (survivalDays-1));
    }
}
