package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BenzBusinessCar extends AbstractBenzCar {

    public BenzBusinessCar() {
        super();
    }

    public BenzBusinessCar(String name) {
        super(name);
    }

    @Override public void drive() {
        System.out.println("this is benz business car!!!");
    }

}
