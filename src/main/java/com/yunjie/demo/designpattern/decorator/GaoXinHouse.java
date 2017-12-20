package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class GaoXinHouse extends HouseComponent {

    @Override
    String getDescription() {
        return "this is gao xin";
    }

    @Override
    BigDecimal worth() {
        return new BigDecimal(1500000);
    }

}
