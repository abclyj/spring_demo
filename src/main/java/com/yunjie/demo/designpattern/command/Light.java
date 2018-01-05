package com.yunjie.demo.designpattern.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */
@Data
@AllArgsConstructor
public class Light {

    private String name;

    public void lightOn() {
        System.out.println("light" + name + " on!!!");
    }

    public void lightOff() {
        System.out.println("light" + name + " off!!!");
    }

}
