package chapter9;

import jdk.nashorn.internal.codegen.CompilerConstants;

abstract class Incomplete implements Callback {
    int a,b;

    void show(){
        System.out.println(a + " " + b);
    }
}
