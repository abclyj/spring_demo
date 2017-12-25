package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
abstract class AbstractBmwCar {

    private String name;

    public AbstractBmwCar() {
    }

    public AbstractBmwCar(String name) {
        this.name = name;
    }

    public abstract void drive();

}
