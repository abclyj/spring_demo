package com.yunjie.demo.designpattern.singleton;

/**
 * @author yunjie
 * @date 18-1-2
 */


/**
 * 线程安全的饿汉式
 */
public class Singleton4 {

    private static Singleton4 singleton4;

    public static synchronized Singleton4 getSingleton4() {
        if (singleton4 == null) {
            return singleton4;
        }
        return singleton4;
    }

}
