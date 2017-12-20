package com.yunjie.demo.designpattern.decorator;

/**
 * @author yunjie
 * @date 17-12-20
 */
public class DecoratorClient {

    public static void main(String[] args) {
        WithCarportHouse withCarportHouse = new WithCarportHouse(new TianFuHouse());
        System.out.println(withCarportHouse.getDescription() + " worth : " + withCarportHouse.worth());

        WithCarportHouse withCarportHouse1 = new WithCarportHouse(new GaoXinHouse());
        System.out.println(withCarportHouse1.getDescription() + " worth : " + withCarportHouse1.worth());


        HardCoverHouse hardCoverHouse = new HardCoverHouse(new TianFuHouse());
        System.out.println(hardCoverHouse.getDescription() + " worth : " + hardCoverHouse.worth());

        HardCoverHouse hardCoverHouse1 = new HardCoverHouse(new GaoXinHouse());
        System.out.println(hardCoverHouse1.getDescription() + " worth : " + hardCoverHouse1.worth());
    }

}
