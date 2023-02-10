package chapter7;

class VerArgs {
    static void vaTest(int ... v) {
        System.out.print("Numbe rof args: " + v.length+ " Contents: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}