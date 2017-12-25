package com.yunjie.demo.designpattern.factory.simplefactory;

/**
 * @author yunjie
 * @date 17-12-25
 */


/**
 * 简单工厂模式
 */
public class CarClient {

    public static void main(String[] args) {
        AbstractCar car = Driver.createCar("benz");
        car.drive();
    }

}
