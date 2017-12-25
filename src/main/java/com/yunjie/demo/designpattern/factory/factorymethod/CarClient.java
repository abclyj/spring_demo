package com.yunjie.demo.designpattern.factory.factorymethod;

/**
 * @author yunjie
 * @date 17-12-25
 */


/**
 * 工厂方法
 */
public class CarClient {

    public static void main(String[] args) {
        Driver driver = new BmwDriver();
        AbstractCar car = driver.createCar();
        car.drive();
    }

}
