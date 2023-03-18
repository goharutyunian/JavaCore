package homework.collections;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionExample2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Lily");
        names.add("Sofia");
        names.add("Sarah");
        names.add("Harry");
        names.add("Lewis");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Harry " + i + ": ");
            names.add(scanner.nextLine());

        }


    }

}

