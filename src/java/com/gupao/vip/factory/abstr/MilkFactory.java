package java.com.gupao.vip.factory.abstr;


import java.com.gupao.vip.factory.simple.milk.guangming;
import java.com.gupao.vip.factory.simple.milk.mengniu;
import java.com.gupao.vip.factory.simple.milk.milk;
import java.com.gupao.vip.factory.simple.milk.yili;

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
