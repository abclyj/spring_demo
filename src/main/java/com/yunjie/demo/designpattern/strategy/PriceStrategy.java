package com.yunjie.demo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public interface PriceStrategy {

    BigDecimal calculate(int kilometre);

}
