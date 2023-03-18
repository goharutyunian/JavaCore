package homework.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Katy");
        names.add("Susie");
        names.add("Hunter");
        names.add("Lewis");

        Scanner scanner = new Scanner("Susie");
        String findTheName = scanner.nextLine();

        if (names.contains(findTheName)) {
            System.out.println("The name " + findTheName + " is in the list.");
        } else {
            System.out.println("The name " + findTheName + " is not in the list.");
        }

    }
}



