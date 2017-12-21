package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class TianFuHouse extends HouseComponent {

    public TianFuHouse(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

    @Override
    String getDescription() {
        return "this is tian fu " + houseSize.getDescription() + " house";
    }

    @Override
    BigDecimal worth() {
        switch (houseSize) {
            case LARGE:
                return new BigDecimal(1200000);
            case MEDIUM:
                return new BigDecimal(1100000);
            default:
                return new BigDecimal(1000000);
        }
    }

}
