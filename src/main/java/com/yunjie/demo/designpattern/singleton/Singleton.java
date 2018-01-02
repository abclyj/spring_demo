package com.yunjie.demo.designpattern.singleton;

/**
 * @author yunjie
 * @date 17-12-26
 */


/**
 * 懒汉式
 */
public class Singleton {

    private static final Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            return new Singleton();
        }
        return INSTANCE;
    }

}
