package homework.homework7;

public class Calculator {

    double plus(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("The number is not divisible by 0");
            return -1;
        }
        return a / b;
    }
}
