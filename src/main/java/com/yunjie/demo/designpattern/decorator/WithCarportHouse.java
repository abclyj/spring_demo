package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class WithCarportHouse extends HouseDecorator {

    HouseComponent houseComponent;

    private static final BigDecimal CAR_PORT_WORTH = new BigDecimal(200000);

    public WithCarportHouse(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }

    @Override
    String getDescription() {
        return houseComponent.getDescription() + " with car port ";
    }

    @Override
    BigDecimal worth() {
        return houseComponent.worth().add(CAR_PORT_WORTH);
    }

}
