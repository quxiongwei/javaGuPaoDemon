package java.com.gupao.vip.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println("simpleFactory = " + simpleFactory.getMilk("蒙牛"));
    }




}
