package com.yunjie.demo.designpattern.observer;

import java.math.BigDecimal;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class ObserverClient {

    public static void main(String[] args) {
        HousePriceSubject housePriceSubject = new HousePriceSubject();
        PeopleOneObserver peopleOneObserver = new PeopleOneObserver();
        PeopleTwoObserver peopleTwoObserver = new PeopleTwoObserver();
        housePriceSubject.addObserver(peopleOneObserver);
        housePriceSubject.addObserver(peopleTwoObserver);
        housePriceSubject.setPrice(new BigDecimal(15000));
        housePriceSubject.notifyObservers();
    }

}
