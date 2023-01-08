package homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        System.out.println("First Element: " + array[0]);
        int lastIndex = array.length - 1;
        System.out.println("Last Element: " + array[lastIndex]);
        System.out.print("All Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);

        System.out.println();
        System.out.println("Evens:");
        for (int x : array) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.println("Odds:");
        for (int x : array) {
            if (x % 2 != 0) {
                System.out.println(x + " ");
            }
        }

        int evenCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Number of pairs:" + evenCount);

        int oddCount = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odds:" + oddCount);

    }

}














