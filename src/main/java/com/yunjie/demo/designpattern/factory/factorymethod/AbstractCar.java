package com.yunjie.demo.designpattern.factory.factorymethod;

/**
 * @author yunjie
 * @date 17-12-25
 */
public abstract class AbstractCar {

    private String name;

    public AbstractCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象方法
     */
    public abstract void drive();

}
