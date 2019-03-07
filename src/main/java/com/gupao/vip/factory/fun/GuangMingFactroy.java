package com.gupao.vip.factory.fun;


import com.gupao.vip.factory.simple.milk.guangming;
import com.gupao.vip.factory.simple.milk.milk;

public class GuangMingFactroy implements  Factroy {
    @Override
    public milk getMilk() {
        return new guangming();
    }
}
