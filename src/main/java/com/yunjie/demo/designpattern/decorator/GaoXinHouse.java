package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class GaoXinHouse extends HouseComponent {

    public GaoXinHouse(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

    @Override
    String getDescription() {
        return "this is gao xin " + houseSize.getDescription() + " house!";
    }

    @Override
    BigDecimal worth() {
        switch (houseSize) {
            case LARGE:
                return new BigDecimal(1700000);
            case MEDIUM:
                return new BigDecimal(1600000);
            default:
                return new BigDecimal(1500000);
        }
    }

}
