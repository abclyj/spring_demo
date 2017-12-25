package com.yunjie.demo.designpattern.factory.house;

/**
 * @author yunjie
 * @date 17-12-22
 */
public class WithCarHouseFactory extends IntermediaryAgency {

    @Override
    HouseProduct crateHouseProduct() {
        return new WithCarHouse("带车位的房子！");
    }

}
