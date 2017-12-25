package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BusinessCarDriver extends AbstractDriver {

    @Override public AbstractBenzCar createBenzCar() {
        return new BenzBusinessCar("benz business car");
    }

    @Override public AbstractBmwCar createBmwCar() {
        return new BmwBusinessCar("bmw business car");
    }

}
