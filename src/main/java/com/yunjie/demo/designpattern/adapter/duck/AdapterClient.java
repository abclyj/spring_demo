package com.yunjie.demo.designpattern.adapter.duck;

/**
 * @author yunjie
 * @date 18-1-3
 */
public class AdapterClient {

    public static void main(String[] args) {
        Duck normalDuck = new NormalDuck();
        normalDuck.quack();
        normalDuck.fly();
        System.out.println("=================================================");
        TurKey normalTurkey = new NormalTurkey();
        Duck turkey = new TurkeyAdapter(normalTurkey);
        turkey.quack();
        turkey.fly();
    }

}
