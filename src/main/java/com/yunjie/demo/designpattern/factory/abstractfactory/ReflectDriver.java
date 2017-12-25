package com.yunjie.demo.designpattern.factory.abstractfactory;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class ReflectDriver {

    public static AbstractBenzCar createBenzCar(String filed) {
        try {
            return (AbstractBenzCar) Class.forName(filed).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static AbstractBmwCar createBmwCar(String filed) {
        try {
            return (AbstractBmwCar) Class.forName(filed).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
