package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BmwBusinessCar extends AbstractBmwCar {

    public BmwBusinessCar() {
        super();
    }

    public BmwBusinessCar(String name) {
        super(name);
    }

    @Override public void drive() {
        System.out.println("this is bmw business car!!!");
    }

}
