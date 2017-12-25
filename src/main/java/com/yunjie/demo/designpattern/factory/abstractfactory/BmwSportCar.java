package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BmwSportCar extends AbstractBmwCar {

    public BmwSportCar() {
        super();
    }

    public BmwSportCar(String name) {
        super(name);
    }

    @Override public void drive() {
        System.out.println("this is bmw sport car!!!");
    }
}
