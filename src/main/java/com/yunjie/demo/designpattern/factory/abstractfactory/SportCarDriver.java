package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class SportCarDriver extends AbstractDriver {

    @Override public AbstractBenzCar createBenzCar() {
        return new BenzSportCar("benz sport car");
    }

    @Override public AbstractBmwCar createBmwCar() {
        return new BmwSportCar("bmw sport car");
    }

}
