package com.yunjie.demo.designpattern.adapter.duck;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */
@Data
@AllArgsConstructor
public class TurkeyAdapter implements Duck {

    private TurKey turKey;

    @Override
    public void quack() {
        turKey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turKey.fly();
        }
    }

}
