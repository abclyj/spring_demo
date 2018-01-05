package com.yunjie.demo.designpattern.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yunjie
 * @date 18-1-3
 */
@Data
@AllArgsConstructor
public class LightOffCommand implements Command {

    private Light lightOff;

    @Override
    public void execute() {
        lightOff.lightOff();
    }

}
