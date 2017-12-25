package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class ReflectCarClient {

    public static void main(String[] args) {
        AbstractBmwCar bmwCar = ReflectDriver.createBmwCar("com.yunjie.demo.designpattern.factory.abstractfactory.BmwBusinessCar");
        bmwCar.drive();
    }

}
