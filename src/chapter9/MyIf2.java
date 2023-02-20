package chapter9;

public interface MyIf2 {
    int getNumber();

    default String getString() {
        return "Default String";
    }
    static int getDefaultNumber() {
        return 0;
    }
}
