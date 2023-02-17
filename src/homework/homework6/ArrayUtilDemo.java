package homework.homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        int x = au.maxofArray(array);
        System.out.println("Max: + x");
        System.out.println("Max * 2 = " + x * 2);
        System.out.println(x % 2 == 0 ? "Double" : "Odd");


    }
}
