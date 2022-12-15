package chapter2;

public class IfSample {

    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("X is less than y");
        }

        x = x * 2;
        if (x == 2) {
            System.out.println("X is equal to y");
        }

        x = x * 2;
        if (x > 2) {
            System.out.println("X is now greater than y");
        }

    }
}
