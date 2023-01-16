package chapter6;

import java.sql.SQLOutput;

class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.volumeFour();
        System.out.println("Volume is "+ vol);

        vol = mybox2.volumeFour();
        System.out.println("Volume is " + vol );
    }

}