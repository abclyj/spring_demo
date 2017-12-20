package com.yunjie.demo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class CalculateContext {

    private PriceStrategy priceStrategy;

    public CalculateContext(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public BigDecimal calculate(int kilometre) {
        return priceStrategy.calculate(kilometre);
    }

}
