package chapter11;

public class DeadLock  {
    A a = new A();
    B b = new B();
    Thread t;

    DeadLock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread((Runnable) this, "RacingThread");
    }

    void deadlockStart() {
        t.start();
        a.foo(b);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        dl.deadlockStart();
    }
}
