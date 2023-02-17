package chapter6.stack;

public class Stack {
    private int array[] = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is underflow");
        } else {
            array[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return array[tos--];
    }
}
