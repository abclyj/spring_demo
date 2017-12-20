package com.yunjie.demo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class BusStrategy implements PriceStrategy {

    @Override
    public BigDecimal calculate(int kilometre) {
        return kilometre < 10 ? new BigDecimal(100) : new BigDecimal(200);
    }

}
