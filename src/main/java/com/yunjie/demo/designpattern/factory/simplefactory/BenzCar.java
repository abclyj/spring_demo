package com.yunjie.demo.designpattern.factory.simplefactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BenzCar extends AbstractCar {

    public BenzCar(String name) {
        super(name);
    }

    @Override public void drive() {
        System.out.println("this is benz!!!");
    }

}
