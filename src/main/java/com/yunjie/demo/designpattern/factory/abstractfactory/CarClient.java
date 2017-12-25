package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */


/**
 * 抽象工厂模式
 */
public class CarClient {

    public static void main(String[] args) {
        AbstractDriver driver = new SportCarDriver();
        AbstractBenzCar benzCar = driver.createBenzCar();
        benzCar.drive();
    }

}
