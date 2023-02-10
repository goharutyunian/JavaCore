package chapter8;

class X {
    void calme() {
        System.out.println("Inside X's callme method");
    }
}

class K extends X {
    void callme() {
        System.out.println("Inside K's callme method");
    }
}

class L extends X {
    void callme() {
        System.out.println("Inside L's callme method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        X x = new X();
        K k = new K();
        L l = new L();

        X r;
        r = x;
        r.calme();

        r = k;
        r.calme();

        r = l;
        r.calme();
    }
}