package chapter9;

import jdk.nashorn.internal.codegen.CompilerConstants;

 class Client implements Callback {
     public void callback(int p) {

        System.out.println("callback called with "+ p);
    }
}
