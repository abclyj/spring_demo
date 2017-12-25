package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
abstract class AbstractBenzCar {

    private String name;

    public AbstractBenzCar() {
    }

    public AbstractBenzCar(String name) {
        this.name = name;
    }

    public abstract void drive();

}
