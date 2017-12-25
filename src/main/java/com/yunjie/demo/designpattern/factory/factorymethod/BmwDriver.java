package com.yunjie.demo.designpattern.factory.factorymethod;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class BmwDriver implements Driver {

    @Override public AbstractCar createCar() {
        return new BmwCar("bmw");
    }

}
