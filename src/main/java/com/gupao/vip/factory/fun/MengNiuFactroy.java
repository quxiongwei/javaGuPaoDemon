package com.gupao.vip.factory.fun;


import com.gupao.vip.factory.simple.milk.mengniu;
import com.gupao.vip.factory.simple.milk.milk;

public class MengNiuFactroy implements Factroy {
    @Override
    public milk getMilk() {
        return new mengniu();
    }
}
