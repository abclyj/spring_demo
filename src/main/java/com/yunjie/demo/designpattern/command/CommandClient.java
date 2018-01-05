package com.yunjie.demo.designpattern.command;

/**
 * @author yunjie
 * @date 18-1-3
 */
public class CommandClient {

    public static void main(String[] args) {
        Light light = new Light("客厅");
        Command command = new LightOnCommand(light);
        LightControl lightControl = new LightControl(command);
        lightControl.turnOn();
    }

}
