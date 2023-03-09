package chapter14;


class Gen2<T> extends Gen<Integer> {

    Gen2(int o) {
        super(o);
    }
    String getob() {
        System.out.println("You called String getob(): ");
        return ob;
    }
}
