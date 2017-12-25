package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
abstract class AbstractDriver {

    public abstract AbstractBenzCar createBenzCar();

    public abstract AbstractBmwCar createBmwCar();

}
