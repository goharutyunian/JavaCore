package chapter8;

class V {
    int i, j;

    V(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class P extends V {
    int k;

    P(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        P subOb = new P(1, 2, 3);

        subOb.show();
    }
}

