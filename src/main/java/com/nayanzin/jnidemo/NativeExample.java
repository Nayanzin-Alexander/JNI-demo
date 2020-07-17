package com.nayanzin.jnidemo;

public class NativeExample {

    public native int square(int i);

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("NativeExample");
        NativeExample nativeExample = new NativeExample();

        System.out.println(nativeExample.square(2));
    }
}
