package chapter5;

public class SampleSwitch {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                case 1:
                    System.out.println("i is one");
                case 2:
                    System.out.println("i is two");
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
    }

}
