package com.yunjie.demo.designpattern.factory.simplefactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
abstract class AbstractCar {

    public AbstractCar(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void drive();

}
