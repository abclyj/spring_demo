package com.yunjie.demo.designpattern.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */

@Data
@AllArgsConstructor
public class LightControl {

    private Command command;

    public void turnOn() {
        command.execute();
    }

}
