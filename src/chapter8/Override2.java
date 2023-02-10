package chapter8;

class M {
    int i, j;

    M(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("I and j: " + i + " " + j);
    }
}

class Z extends M {
    int k;

    Z(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main(String[] args) {
        Z subOb = new Z(1, 2, 3);

        subOb.show("This is k: ");
        subOb.show();
    }
}