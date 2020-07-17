package com.nayanzin.jnidemo.config;

public class NativeAwareTestBase {
    static {
        System.loadLibrary("NativeExample");
    }
}
