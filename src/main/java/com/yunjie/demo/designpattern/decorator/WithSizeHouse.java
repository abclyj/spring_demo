package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class WithSizeHouse extends HouseDecorator {

    private HouseComponent houseComponent;

    public WithSizeHouse(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }

    @Override
    public HouseSize getHouseSize() {
        return houseComponent.getHouseSize();
    }

    @Override
    String getDescription() {
        return houseComponent.getDescription() + " with size: " + houseComponent.getHouseSize();
    }

    @Override
    BigDecimal worth() {
        switch (getHouseSize()) {
            case LARGE:
                return new BigDecimal(10000).add(houseComponent.worth());
            case MEDIUM:
                return new BigDecimal(20000).add(houseComponent.worth());
            default:
                return houseComponent.worth();
        }
    }

}
