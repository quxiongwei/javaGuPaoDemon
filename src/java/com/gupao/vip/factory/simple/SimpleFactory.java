package java.com.gupao.vip.factory.simple;


import java.com.gupao.vip.factory.simple.milk.guangming;
import java.com.gupao.vip.factory.simple.milk.mengniu;
import java.com.gupao.vip.factory.simple.milk.milk;
import java.com.gupao.vip.factory.simple.milk.yili;


/**
 * 简单工厂模式
 */
public class SimpleFactory {


    public milk getMilk(String name){
        if ("蒙牛".equals(name)){
            return new mengniu();
        }else if ("伊利".equals(name)){
            return new yili();
        }else if("光明".equals(name)){}
        return new guangming();
    }




   /* @Override
    public String name(String name) {
        if ("蒙牛".equals(name)){
            return "蒙牛";
        }else if ("伊利".equals(name)){
            return "伊利";
        }else if("光明".equals(name)){}
            return "光明";

    }*/
}
