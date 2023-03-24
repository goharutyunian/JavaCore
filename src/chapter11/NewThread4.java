package chapter11;

public class NewThread4 implements Runnable {
    String name;
    Thread t;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread("This, name");
        System.out.println("New thread: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i < 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
