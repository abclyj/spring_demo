package com.yunjie.demo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class SubwayStrategy implements PriceStrategy {

    @Override
    public BigDecimal calculate(int kilometre) {
        return kilometre < 20 ? new BigDecimal(1000) : new BigDecimal(2000);
    }

}
