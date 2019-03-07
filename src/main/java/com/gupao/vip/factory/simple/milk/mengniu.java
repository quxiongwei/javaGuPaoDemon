package com.gupao.vip.factory.simple.milk;

/**
 * 蒙牛生产厂家
 */
public class mengniu implements milk {
    @Override
    public String name(String name) {
        return "蒙牛";
    }
}
