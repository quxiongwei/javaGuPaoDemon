package com.gupao.vip.SevenPrinciplesOfDesign.ocp;

/**
 * 开闭原则（Open-Closed Principle, OCP）是指一个软件实体如类、
 * 模块和函数应该对扩展开放，对修改关闭。所谓的开闭，也正是对扩展和修改两个行为的一个原则。
 * 强调的是用抽象构建框架，用实现扩展细节。可以提高软件系统的可复用性及可维护性。开闭原则，
 * 是面向对象设计中最基础的设计原则。
 */
public class JavaCourse implements Icourse {
    private Integer Id;
    private String name;
    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }



    public Integer getd() {
        return this.Id;
    }


    public String getName() {
        return this.name;
    }


    public Double getPrice() {
        return this.price;
    }
}
