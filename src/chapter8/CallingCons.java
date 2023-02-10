package chapter8;

import java.sql.SQLOutput;

class E {
    E() {
        System.out.println("Inside E's constructor");
    }
}

class F extends E {
    F() {
        System.out.println("Inside F's constructor");
    }
}

class G extends F {
    G() {
        System.out.println("Inside G's constructor");
    }
}

class CallingCons {
    public static void main(String[] args) {
        G g = new G();
    }
}