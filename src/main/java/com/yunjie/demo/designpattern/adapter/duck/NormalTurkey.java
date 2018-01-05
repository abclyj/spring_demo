package com.yunjie.demo.designpattern.adapter.duck;

/**
 * @author yunjie
 * @date 18-1-3
 */
public class NormalTurkey implements TurKey {

    @Override
    public void gobble() {
        System.out.println("gobble ... gobble ...");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly ...");
    }

}
