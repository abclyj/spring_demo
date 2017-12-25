package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BenzSportCar extends AbstractBenzCar {

    public BenzSportCar() {
        super();
    }

    public BenzSportCar(String name) {
        super(name);
    }

    @Override public void drive() {
        System.out.println("this is benz sport car!!!");
    }

}
