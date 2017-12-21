package com.yunjie.demo.designpattern.decorator;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class DecoratorClient {

    public static void main(String[] args) {

        HouseComponent houseComponent = new WithSizeHouse(new WithCarportHouse(new TianFuHouse(HouseSize.LARGE)));
        System.out.println(houseComponent.getDescription() + " worth : " + houseComponent.worth());

        HouseComponent houseComponent1 = new WithSizeHouse(new HardCoverHouse(new GaoXinHouse(HouseSize.SMALL)));
        houseComponent1.setHouseSize(HouseSize.SMALL);
        System.out.println(houseComponent1.getDescription() + " worth : " + houseComponent1.worth());

    }

}
