package com.yunjie.demo.designpattern.factory.simplefactory;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yunjie
 * @date 17-12-25
 */
public class Driver {

    public static AbstractCar createCar(String carName) {
        if (StringUtils.equals(carName, "benz")) {
            return new BenzCar("benz");
        } else if (StringUtils.equals(carName, "bmw")) {
            return new BmwCar("bmw");
        }
        return null;
    }

}
