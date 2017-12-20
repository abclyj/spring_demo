package com.yunjie.demo.designpattern.observer;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class PeopleOneObserver implements Observer {

    private static final String HIGH_HOUSE_PRICE = "10000";

    @Override
    public void update(Observable o, Object arg) {
        HousePriceSubject housePriceSubject = (HousePriceSubject) o;
        if (housePriceSubject.getPrice().compareTo(new BigDecimal(HIGH_HOUSE_PRICE)) > 0) {
            System.out.println("people one : i can not buy!!!");
        } else {
            System.out.println("people one : i will buy!!!");
        }
    }

}
