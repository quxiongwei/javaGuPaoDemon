package com.gupao.base.day1;

/**
 * 下面的例子展示如何访问实例变量和调用成员方法：
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("这条小狗的名字是：" + name);
    }

    public int getPuppyAge() {
        System.out.println("这条小狗的年龄是：" + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }


    public static void main(String[] args) {
        //创建对象
        Puppy puppy = new Puppy("小沐");
        //通过方法来添加age
        puppy.setPuppyAge(10);
        // 调用另一个方法获取age
        puppy.getPuppyAge();
    //你也可以像下面这样访问成员变量
        System.out.println("变量值 = " + puppy.getPuppyAge());


    }

}
