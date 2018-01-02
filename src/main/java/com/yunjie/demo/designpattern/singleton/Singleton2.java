package com.yunjie.demo.designpattern.singleton;

/**
 * @author yunjie
 * @date 17-12-26
 */


/**
 * 饿汉式
 */
public class Singleton2 {

    private static final Singleton2 SINGLETON_2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getSingleton2() {
        return SINGLETON_2;
    }

}
