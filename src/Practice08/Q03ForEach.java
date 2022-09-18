package Practice08;

public class Q03ForEach {

    public static void main(String[] args) {
        /*
         // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

       // Part 2:
       // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop
         */

        String [] list= {"fruits", "meat", "milk", "vegetables"};

        for (String element:list) {
            System.out.println(element + " : " + element.length());
        }

        for (String item:list) {
            if (item.startsWith("v")) {
                break;
            }
            System.out.println(item);
        }
    }
}
