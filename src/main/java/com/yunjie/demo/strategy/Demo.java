package com.yunjie.demo.strategy;

/**
 * @author yunjie
 * @date 17-12-19
 */
public class Demo {

    public static void main(String[] args) {
        DemoRequest demoRequest1 = DemoRequest.builder().name("fasd").age(123).build();
        System.out.println(demoRequest1);
    }

}
