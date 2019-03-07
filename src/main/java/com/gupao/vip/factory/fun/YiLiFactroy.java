package com.gupao.vip.factory.fun;


import com.gupao.vip.factory.simple.milk.milk;
import com.gupao.vip.factory.simple.milk.yili;

/**
 * 伊利工厂
 */
public class YiLiFactroy implements Factroy{


    @Override
    public milk getMilk() {
        return  new yili();
    }
}
