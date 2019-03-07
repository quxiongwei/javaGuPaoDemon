package com.gupao.vip.SevenPrinciplesOfDesign.dip;


/**
 * 依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模
 块不应该依赖底层模块，二者都应该依赖其抽象。抽象不应该依赖细节；细节应该依赖抽象。
 通过依赖倒置，可以减少类与类之间的耦合性，提高系统的稳定性，提高代码的可读性和可维护性，
 并能够降低修改程序所造成的风险。接下来看一个案例，还是以课
 程为例，先来创建一个类 Tom
 */
public class Tom {

 /*   public void studyJavaSourse(){
        System.out.println("Tom在学习java的课程");
    }

    public void stutdyPhySourse(){
        System.out.println("Tom在学习PHP的课程");
    }*/

    public void study(ICourse iCourse){
     iCourse.study();
    }



}
