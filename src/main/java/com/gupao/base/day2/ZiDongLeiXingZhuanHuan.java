package com.gupao.base.day2;

/**
 *
 * 低  ------------------------------------>  高

 byte,short,char—> int —> long—> float —> double

 数据类型转换必须满足如下规则：

 1. 不能对boolean类型进行类型转换。

 2. 不能把对象类型转换成不相关类的对象。

 3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

 4. 转换过程中可能导致溢出或损失精度

 */
public class ZiDongLeiXingZhuanHuan {
       //因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。
        int i =128;
        byte b= (byte) i;
//浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

      //  (int)23.7 == 23;
       // (int)-45.89f == -45

    public static void main(String[] args) {
       char a='1';
       int c =a;
        System.out.println("char自动转化成int: =" + c);
        char c2 = 'A';//定义一个char类型
        int f=c2+1;
        System.out.println("char类型和int计算后的值等于：=" + f);
        




    }

}
