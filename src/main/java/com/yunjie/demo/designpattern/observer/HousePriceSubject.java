package com.yunjie.demo.designpattern.observer;

import java.math.BigDecimal;
import java.util.Observable;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class HousePriceSubject extends Observable {

    private BigDecimal price;

    @Override
    public void notifyObservers() {
        super.setChanged();
        super.notifyObservers();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
