package java.com.gupao.vip.factory.fun;


import java.com.gupao.vip.factory.simple.milk.mengniu;
import java.com.gupao.vip.factory.simple.milk.milk;

public class MengNiuFactroy implements Factroy {
    @Override
    public milk getMilk() {
        return new mengniu();
    }
}
