package com.yunjie.demo.designpattern.strategy;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class StrategyClient {

    public static void main(String[] args) {
        CalculateContext calculateContext = new CalculateContext(new BusStrategy());
        System.out.println("take bus will cast:" + calculateContext.calculate(15));

        CalculateContext calculateContext1 = new CalculateContext(new SubwayStrategy());
        System.out.println("take subway will cast:" + calculateContext1.calculate(15));
    }

}
