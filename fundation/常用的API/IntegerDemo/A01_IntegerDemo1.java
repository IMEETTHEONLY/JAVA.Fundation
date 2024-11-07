package 常用的API.IntegerDemo;

import java.util.Scanner;

public class A01_IntegerDemo1 {

    public static void main(String[] args) {
        //利用构造方法获取Integer对象(不常用，这是jdk5以前的方式)
        Integer i1=new Integer(1);
        Integer i2=new Integer("1");

        System.out.println(i1);
        System.out.println(i2);

        // //利用静态方法获取Integer对象(不常用，这是jdk5以前的方式)
        Integer i5=Integer.valueOf("123",8);  //radix表示的是8进制
        System.out.println(i5);



        //包装类如何进行计算,自动装箱和自动拆箱
        //自动装箱：把基本数据类型自动变成对应的包装类
        //自动拆箱:把包装类自动变成基本数据类型
        Integer i3=10;  //自动装箱

        Integer i4=new Integer(10);

        int i=i4;  //自动拆箱


        //把整数转为二进制，八进制，十六进制
        String str1=Integer.toBinaryString(100);
        System.out.println(str1);


        //转成八进制
        String str2=Integer.toOctalString(100);
        System.out.println(str2);

        //转成十六进制
        String str3=Integer.toHexString(100);
        System.out.println(str3);

        //将字符串类型转为int类型的整数
        int i6 = Integer.parseInt("123");
        System.out.println(i6);
        System.out.println(i+1);
        //细节一:代码转换的时候字符串只能是数字
        //8种包装类中，除了Character都有parsexxx方法



        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str4=sc.nextLine();
        System.out.println(str4);
    }
}
