package homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int smallest = array[0];
        int greatest = array[7];
        if (array[0] < greatest) {
            System.out.println("The smallest number is: " + smallest);
        }
        if (array[7] > smallest) {
            System.out.println("The greatest number is: " + greatest);
        }

    }

}

