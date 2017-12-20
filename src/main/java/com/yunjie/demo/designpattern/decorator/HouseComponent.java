package com.yunjie.demo.designpattern.decorator;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public abstract class HouseComponent {

    abstract String getDescription();

    abstract BigDecimal worth();

}
