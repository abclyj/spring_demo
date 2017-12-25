package com.yunjie.demo.designpattern.factory.house;

/**
 * @author yunjie
 * @date 17-12-22
 */
public abstract class IntermediaryAgency {

    public HouseProduct createHouseProduct() {
        return crateHouseProduct();
    }

    abstract HouseProduct crateHouseProduct();

}
