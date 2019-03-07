package com.gupao.vip.factory.abstr;


import com.gupao.vip.factory.simple.milk.guangming;
import com.gupao.vip.factory.simple.milk.mengniu;
import com.gupao.vip.factory.simple.milk.milk;
import com.gupao.vip.factory.simple.milk.yili;

public class MilkFactory  extends AbstractFactroy{


    @Override
    public milk getMengNiu() {
        return new mengniu();
    }

    @Override
    public milk getYiLi() {
        return new yili();
    }

    @Override
    public milk getGuangMing() {
        return new guangming();
    }
}
