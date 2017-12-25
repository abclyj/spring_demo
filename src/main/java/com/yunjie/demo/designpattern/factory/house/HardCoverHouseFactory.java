package com.yunjie.demo.designpattern.factory.house;

/**
 * @author yunjie
 * @date 17-12-22
 */
public class HardCoverHouseFactory extends IntermediaryAgency {

    @Override
    HouseProduct crateHouseProduct() {
        return new HardCoverHouse("这是精装修房子！");
    }

}
