package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class HardCoverHouse extends HouseDecorator {

    HouseComponent houseComponent;

    private static final BigDecimal HARD_COVER_WORTH = new BigDecimal(300000);

    public HardCoverHouse(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }

    @Override
    public HouseSize getHouseSize() {
        return houseComponent.getHouseSize();
    }

    @Override
    String getDescription() {
        return houseComponent.getDescription() + " with hard cover! ";
    }

    @Override
    BigDecimal worth() {
        return houseComponent.worth().add(HARD_COVER_WORTH);
    }

}
