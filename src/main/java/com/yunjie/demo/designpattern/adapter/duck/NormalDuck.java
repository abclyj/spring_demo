package com.yunjie.demo.designpattern.adapter.duck;

/**
 * @author yunjie
 * @date 18-1-3
 */
public class NormalDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack ... quack ...");
    }

    @Override
    public void fly() {
        System.out.println("duck fly...");
    }

}
