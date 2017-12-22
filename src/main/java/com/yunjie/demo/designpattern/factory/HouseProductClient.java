package com.yunjie.demo.designpattern.factory;

/**
 * @author yunjie
 * @date 17-12-22
 */
public class HouseProductClient {

    public static void main(String[] args) {

        /**
         * 简单工厂模式
         */
        IntermediaryAgency withCarHouseFactory = new WithCarHouseFactory();
        IntermediaryAgency hardCoverFactory = new HardCoverHouseFactory();

        System.out.println(withCarHouseFactory.createHouseProduct().getName());

        System.out.println(hardCoverFactory.createHouseProduct().getName());
    }

}
