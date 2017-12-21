package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public abstract class HouseComponent {

    protected HouseSize houseSize;

    abstract String getDescription();

    abstract BigDecimal worth();

    public HouseSize getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

}
