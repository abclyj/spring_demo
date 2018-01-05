package com.yunjie.demo.designpattern.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */
@Data
@AllArgsConstructor
public class LightOnCommand implements Command {

    private Light lightOn;

    @Override
    public void execute() {
        lightOn.lightOn();
    }

}
