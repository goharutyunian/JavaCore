package homework.homework1;

public class FigurePainter {

    public static void main(String[] args) {
        System.out.println("Figure 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Figure 2");
        for (int i = 1; i <=5; i++) {
            for (int j = i; j<= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Figure 3");
        for (int i = 1; i <=5; i ++) {
            for (int j= i; j <=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
