package com.plkj.studysample;

/**
 * Created by Renzituo
 * on 2020-06-04
 */
public class Hello {
    static {
        System.loadLibrary("Hello");
    }
    public static native String sayHello();
}
