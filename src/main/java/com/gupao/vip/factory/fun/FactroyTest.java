package com.gupao.vip.factory.fun;

public class FactroyTest {
    public static void main(String[] args) {
        Factroy factroy = new GuangMingFactroy();
        System.out.println("factroy.getMilk() = " + factroy.getMilk());

    }
}
