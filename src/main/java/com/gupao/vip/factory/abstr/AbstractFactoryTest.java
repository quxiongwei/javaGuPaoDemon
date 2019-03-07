package com.gupao.vip.factory.abstr;


import com.gupao.vip.factory.simple.milk.milk;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        milk mengNiu = milkFactory.getMengNiu();
        System.out.println("milkFactory.getMengNiu().name() = " + milkFactory.getMengNiu());
    }
}
