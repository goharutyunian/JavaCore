package homework.homework1;

public class IfForExamples {

    public static void main(String[] args) {
        //step1
        int a, b;
        a = 40;
        b = 80;
        if (a == b) {
            System.out.println("both are equal");
        } else if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");

        }
        System.out.println();

        //step2
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //step3
        char c = 'a';
        char c2 = '1';

        a = c;
        b = c2;

        System.out.println(a);
        System.out.println(b);

        System.out.println();

        //step4
        a = 40;
        b = 80;

        if (a < b) {
            System.out.println("A is less than b");
        }

        if (a == b) {
            System.out.println("A is equal to b");
        }

        if (a > b) {
            System.out.println("A is greater than b");
        }


    }
}
