package com.gupao.vip.SevenPrinciplesOfDesign.ocp;

public class CourseTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(1,"测试",1.00);
        System.out.println("javaCourse = " + javaCourse.getPrice());
        JavaCourse javaCourse2 = new JavaCourse(1, "测试", 1.00);
        System.out.println("javaCourse2.getPrice() = " + javaCourse2.getPrice());

    }
}
