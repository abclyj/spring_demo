package com.yunjie.demo.designpattern.adapter.duck;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */

@Data
@AllArgsConstructor
public class DuckAdapter implements TurKey {

    private Duck duck;

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        try {
            Thread.sleep(1000);
            duck.fly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

