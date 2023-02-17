package chapter9.stackversions;

interface IntStack {
    void push(int item);
    int pop();

    default void cleaner() {
        System.out.println("clear() not implemented");
    }
}