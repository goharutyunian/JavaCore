package chapter9;

class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}