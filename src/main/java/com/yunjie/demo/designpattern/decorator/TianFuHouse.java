package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class TianFuHouse extends HouseComponent {

    @Override
    String getDescription() {
        return "this is tian fu house";
    }

    @Override
    BigDecimal worth() {
        return new BigDecimal(1000000);
    }

}
