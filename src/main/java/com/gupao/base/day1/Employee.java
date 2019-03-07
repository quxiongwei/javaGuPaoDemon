package com.gupao.base.day1;

/**
 * 在该例子中，我们创建两个类：Employee 和 EmployeeTest。

 首先打开文本编辑器，把下面的代码粘贴进去。注意将文件保存为 Employee.java。

 Employee类有四个成员变量：name、age、designation和salary。该类显式声明了一个构造方法，该方法只有一个参数。
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类的构造器
    public Employee(String name){
        this.name = name;
    }
    // 设置age的值
    public void empAge(int empAge){
        age =  empAge;
    }
    /* 设置designation的值*/
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}
