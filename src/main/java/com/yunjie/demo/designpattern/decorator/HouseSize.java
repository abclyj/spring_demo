package com.yunjie.demo.designpattern.decorator;

/**
 * @author yunjie
 * @date 17-12-20
 */
public enum HouseSize {

    LARGE("大"),
    MEDIUM("中"),
    SMALL("小");

    private String description;

    HouseSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
