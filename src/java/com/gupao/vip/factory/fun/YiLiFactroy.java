package java.com.gupao.vip.factory.fun;


import java.com.gupao.vip.factory.simple.milk.milk;
import java.com.gupao.vip.factory.simple.milk.yili;

/**
 * 伊利工厂
 */
public class YiLiFactroy implements Factroy{


    @Override
    public milk getMilk() {
        return  new yili();
    }
}
